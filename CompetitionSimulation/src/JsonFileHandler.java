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

	
	public ArrayList<Athlete> readFile(String filePath) {
		Gson gson = new Gson();
		ArrayList<Athlete> athletesRead = null;
		try {
			FileReader reader = new  FileReader(filePath);
			Athlete[] athleteArray = gson.fromJson(reader, Athlete[].class);
			athletesRead = (ArrayList<Athlete>) Arrays.asList(athleteArray);
		} catch (FileNotFoundException err) {
			System.out.println("Erro ao ler o arquivo");
		}
		return athletesRead;
	}
}
