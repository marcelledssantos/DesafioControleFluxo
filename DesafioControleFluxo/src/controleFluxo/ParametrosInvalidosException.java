package controleFluxo;

public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException() {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}
}
