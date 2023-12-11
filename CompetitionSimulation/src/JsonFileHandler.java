import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonFileHandler {

	public String toJson(Athlete athlete) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
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
}
