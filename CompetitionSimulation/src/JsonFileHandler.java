import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonFileHandler {
	
	public String toJson(Athlete athlete) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(athlete);
		return json;
	}
}
