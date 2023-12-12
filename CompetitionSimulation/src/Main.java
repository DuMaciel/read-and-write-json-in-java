import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		JsonFileHandler jsonFileHandler = new JsonFileHandler();
		Gymnast[] gymnastArray = null;
		Swimmer[] swimmerArray = null;
		Weightlifter[] weightlifterArray = null;
		try {
			gymnastArray = jsonFileHandler.readFileGymnast();
			swimmerArray = jsonFileHandler.readFileSwimmer();
			weightlifterArray = jsonFileHandler.readFileWeightlifter();
		} catch (Exception e) {
			System.out.println("Não foi possivel ler os arquivos dos atletas!");
			return;
		}

		ArrayList<Gymnast> gymnasts = new ArrayList<Gymnast>(Arrays.asList(gymnastArray));
		ArrayList<Swimmer> swimmers = new ArrayList<Swimmer>(Arrays.asList(swimmerArray));
		ArrayList<Weightlifter> weightlifters = new ArrayList<Weightlifter>(Arrays.asList(weightlifterArray));
		try {
			processGymnasts(gymnasts);
			processSwimmers(swimmers);
			processWeightlifters(weightlifters);
		} catch (Exception e) {
			System.out.println("Não foi possivel processar os atletas!");
			return;
		}
		System.out.println("Sucesso, arquivos salvos!");
	}

	private static void processGymnasts(ArrayList<Gymnast> athletes) {
		JsonFileHandler jsonFileHandler = new JsonFileHandler();
		String modality = "ginastica";

		Competition competition = new Competition();
		ArrayList<RegistrationDenied> registrationsDenied = new ArrayList<RegistrationDenied>();
		athletes.forEach(athlete -> {
			try {
				competition.registerAthletes(athlete);
			} catch (Exception e) {
				registrationsDenied.add(new RegistrationDenied(athlete.getNome(), e.getMessage()));
			}
		});

		RegistrationDenied[] registrationsDeniedArray = registrationsDenied
				.toArray(new RegistrationDenied[registrationsDenied.size()]);
		ListRegistrationsDenied listRegistrationsDenied = new ListRegistrationsDenied(registrationsDeniedArray.length,
				registrationsDeniedArray);
		jsonFileHandler.writeRegistrationsDenied(listRegistrationsDenied, modality);

		CompetitionSimulation competitionSimulation = new CompetitionSimulation();
		Result result = competitionSimulation.simulate(competition);
		jsonFileHandler.writeResult(result, modality);
	}

	private static void processSwimmers(ArrayList<Swimmer> athletes) {
		JsonFileHandler jsonFileHandler = new JsonFileHandler();
		String modality = "natacao";

		Competition competition = new Competition();
		ArrayList<RegistrationDenied> registrationsDenied = new ArrayList<RegistrationDenied>();
		athletes.forEach(athlete -> {
			try {
				competition.registerAthletes(athlete);
			} catch (Exception e) {
				registrationsDenied.add(new RegistrationDenied(athlete.getNome(), e.getMessage()));
			}
		});

		RegistrationDenied[] registrationsDeniedArray = registrationsDenied
				.toArray(new RegistrationDenied[registrationsDenied.size()]);
		ListRegistrationsDenied listRegistrationsDenied = new ListRegistrationsDenied(registrationsDeniedArray.length,
				registrationsDeniedArray);
		jsonFileHandler.writeRegistrationsDenied(listRegistrationsDenied, modality);

		CompetitionSimulation competitionSimulation = new CompetitionSimulation();
		Result result = competitionSimulation.simulate(competition);
		jsonFileHandler.writeResult(result, modality);
	}

	private static void processWeightlifters(ArrayList<Weightlifter> athletes) {
		JsonFileHandler jsonFileHandler = new JsonFileHandler();
		String modality = "halterofilismo";

		Competition competition = new Competition();
		ArrayList<RegistrationDenied> registrationsDenied = new ArrayList<RegistrationDenied>();
		athletes.forEach(athlete -> {
			try {
				competition.registerAthletes(athlete);
			} catch (Exception e) {
				registrationsDenied.add(new RegistrationDenied(athlete.getNome(), e.getMessage()));
			}
		});

		RegistrationDenied[] registrationsDeniedArray = registrationsDenied
				.toArray(new RegistrationDenied[registrationsDenied.size()]);
		ListRegistrationsDenied listRegistrationsDenied = new ListRegistrationsDenied(registrationsDeniedArray.length,
				registrationsDeniedArray);
		jsonFileHandler.writeRegistrationsDenied(listRegistrationsDenied, modality);

		CompetitionSimulation competitionSimulation = new CompetitionSimulation();
		Result result = competitionSimulation.simulate(competition);
		jsonFileHandler.writeResult(result, modality);
	}

}
