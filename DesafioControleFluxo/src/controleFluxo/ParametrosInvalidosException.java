package controleFluxo;

public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException(String ex) {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}
}
