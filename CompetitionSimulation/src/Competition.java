import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Competition {
	private ArrayList<Athlete> registeredAthletes = new ArrayList<Athlete>();
	private DateTimeFormatter defaultFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void registerAthletes(Athlete athlete) {
		LocalDate birthDate = LocalDate.parse(athlete.getDataNascimento(), defaultFormater);
		Period period = Period.between(birthDate, LocalDate.now());
		int age = period.getYears();
		
		if (age < 18) {
			throw new AgeException("Atleta menor de idade");
		}
		if(age > 45) {
			throw new AgeException("Idade do atleta é superior ao permitido");
		}
		if(athlete.getNumeroLesoes() > 10) {
			throw new ExcessInjuryException("Atleta com excesso de lesoes");
		}
		registeredAthletes.add(athlete);
	}

	public ArrayList<Athlete> getRegisteredAthletes() {
		return registeredAthletes;
	}
}
