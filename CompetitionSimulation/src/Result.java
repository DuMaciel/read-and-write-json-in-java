public class Result {
	private String nomeAtletaCampeao;
	private int numeroDeParticipantes;
	private AthletePerformance[] desempenhos;
	
	public Result(String nomeAtletaCampeao, int numeroDeParticipantes, AthletePerformance[] desempenhos) {
		super();
		this.nomeAtletaCampeao = nomeAtletaCampeao;
		this.numeroDeParticipantes = numeroDeParticipantes;
		this.desempenhos = desempenhos;
	}
}
