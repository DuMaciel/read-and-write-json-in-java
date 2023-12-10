import java.util.ArrayList;

public class Competition {
	private ArrayList<Athlete> atletasCadastrados;
	
	public void cadastrarAtleta(Athlete athlete) {
		atletasCadastrados.add(athlete);
	}

	public ArrayList<Athlete> getAtletasCadastrados() {
		return atletasCadastrados;
	}
}
