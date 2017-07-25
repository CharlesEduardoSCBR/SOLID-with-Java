package modulo._3;

public class Teste {

	public static void main(String[] args) {

		CalculadoraDePrecos calculadora = new CalculadoraDePrecos(new TabelaDePrecoPadrao(), new Frete());
		calculadora.calcula(new Compra(100.00, "sao paulo"));

	}

}
