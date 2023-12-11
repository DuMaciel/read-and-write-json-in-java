import java.math.BigDecimal;

public class Weightlifter extends Athlete{
	public BigDecimal compete() {
		BigDecimal performance = new BigDecimal("0");
		performance = new BigDecimal(1).add(this.forca.multiply(new BigDecimal(1)))
				.add(this.resistencia.multiply(new BigDecimal("0.6"))).add(this.folego.multiply(new BigDecimal("0.4")))
				.add(this.flexibilidade.multiply(new BigDecimal("0.3"))).subtract(this.peso.divide(new BigDecimal(100)))
				.subtract(new BigDecimal(this.numeroLesoes).divide(new BigDecimal(10)));
		return performance;
	}
}
