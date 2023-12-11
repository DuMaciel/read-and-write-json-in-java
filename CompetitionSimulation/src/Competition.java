import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Competition {
	private ArrayList<Athlete> registeredAthletes;
	private DateTimeFormatter defaultFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public void cadastrarAtleta(Athlete athlete) {
		LocalDate birthDate = LocalDate.parse(athlete.getDataNascimento(), defaultFormater);
		Period period = Period.between(birthDate, LocalDate.now());
		int age = period.getYears();
		
		if(age < 18 || age > 45) {
			throw new AgeException("O atleta deve estar entre 18 e 45 anos de idade");
		}
		if(athlete.getNumeroLesoes() > 10) {
			throw new ExcessInjuryException("O atleta tem mais de 10 lesões");
		}
		registeredAthletes.add(athlete);
	}

	public ArrayList<Athlete> getRegisteredAthletes() {
		return registeredAthletes;
	}
}
