import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

public class JsonFileHandler {
	
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public String toJson(Athlete athlete) {
		String json = gson.toJson(athlete);
		return json;
	}

	public Gymnast[] readFileGymnast() {
		Gson gson = new Gson();
		Gymnast[] athleteArray = null;
		try {
			FileReader reader = new FileReader("ginastas.json");
			athleteArray = gson.fromJson(reader, Gymnast[].class);
		} catch (FileNotFoundException err) {
			System.out.println("Erro ao ler o arquivo");
		}
		return athleteArray;
	}

	public Swimmer[] readFileSwimmer() {
		Gson gson = new Gson();
		Swimmer[] athleteArray = null;
		try {
			FileReader reader = new FileReader("nadadores.json");
			athleteArray = gson.fromJson(reader, Swimmer[].class);
		} catch (FileNotFoundException err) {
			System.out.println("Erro ao ler o arquivo");
		}
		return athleteArray;
	}

	public Weightlifter[] readFileWeightlifter() {
		Gson gson = new Gson();
		Weightlifter[] athleteArray = null;
		try {
			FileReader reader = new FileReader("halterofilistas.json");
			athleteArray = gson.fromJson(reader, Weightlifter[].class);
		} catch (FileNotFoundException err) {
			System.out.println("Erro ao ler o arquivo");
		}
		return athleteArray;
	}
	
	public void writeResult(Result result, String modality) {
		try {
			FileWriter writer = new FileWriter("resultado-" + modality + ".json");
			gson.toJson(result, writer);
			writer.close();
		} catch (JsonIOException | IOException err) {
			System.out.println("Erro ao salvar o aquivo");
		}
	}
	
	public void writeRegistrationsDenied(ListRegistrationsDenied listRegistrationsDenied, String modality) {
		try {
			FileWriter writer = new FileWriter(" inscricoes-negadas-" + modality + ".json");
			gson.toJson(listRegistrationsDenied, writer);
			writer.close();
		} catch (JsonIOException | IOException err) {
			System.out.println("Erro ao salvar o aquivo");
		}
	}
}
