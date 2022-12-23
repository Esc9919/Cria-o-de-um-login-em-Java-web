package Modelo.Excecoes;

public class LimiteSaqueException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LimiteSaqueException(String msg) {
		super(msg);
	}
	
}
