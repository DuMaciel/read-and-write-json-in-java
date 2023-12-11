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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public BigDecimal getFlexibilidade() {
		return flexibilidade;
	}

	public BigDecimal getResistencia() {
		return resistencia;
	}

	public BigDecimal getFolego() {
		return folego;
	}

	public BigDecimal getForca() {
		return forca;
	}

	public int getNumeroLesoes() {
		return numeroLesoes;
	}
}
