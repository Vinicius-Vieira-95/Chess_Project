package boardgame;

public class BoardException extends RuntimeException{

	//exce��o personalizada
	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
}
