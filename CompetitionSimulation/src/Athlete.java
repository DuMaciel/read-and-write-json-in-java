import java.math.BigDecimal;

public abstract class Athlete {
	protected String nome;
	protected String dataNascimento;
	protected BigDecimal peso;
	protected BigDecimal flexibilidade;
	protected BigDecimal resistencia;
	protected BigDecimal folego	;
	protected BigDecimal forca;
	protected int numeroLesoes;
	
	public abstract BigDecimal compete();

	public String getNome() {
		return nome;
	}
}
