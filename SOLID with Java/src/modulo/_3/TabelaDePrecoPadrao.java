package modulo._3;

public class TabelaDePrecoPadrao {

	public double descontoPara(double valor) {
		if (valor > 5000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
