import java.util.ArrayList;

public class Competition {
	private ArrayList<Athlete> registeredAthletes;
	
	public void registerAthlete(Athlete athlete) {
		registeredAthletes.add(athlete);
	}

	public ArrayList<Athlete> getRegisteredAthletes() {
		return registeredAthletes;
	}
}
