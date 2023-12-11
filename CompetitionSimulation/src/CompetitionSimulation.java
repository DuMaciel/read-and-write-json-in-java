import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CompetitionSimulation {
	public Result simulate(Competition competition) {
		ArrayList<Athlete> athletes = competition.getRegisteredAthletes();
		AtomicReference<Athlete> winningAthlete = new AtomicReference<>();
		ArrayList<AthletePerformance> athletePerformance = new ArrayList<AthletePerformance>();

		athletes.forEach(athlete -> {
			BigDecimal athletePerformace = athlete.compete();
			if (athletePerformace.compareTo(winningAthlete.get().compete()) == 1) {
				winningAthlete.set(athlete);
			}
			athletePerformance.add(new AthletePerformance(athlete.getNome(), athletePerformace));
		});

		AthletePerformance[] athletePerformanceArray = athletePerformance.toArray(new AthletePerformance[athletePerformance.size()]);

		return (new Result(winningAthlete.get().getNome(), athletePerformanceArray.length, athletePerformanceArray));
	}
}
