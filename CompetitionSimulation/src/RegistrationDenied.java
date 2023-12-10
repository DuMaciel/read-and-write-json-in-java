public class RegistrationDenied {
	private String nomeAtleta;
	private String motivo;
	
	public RegistrationDenied(String nomeAtleta, String motivo) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.motivo = motivo;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public String getMotivo() {
		return motivo;
	}
}
