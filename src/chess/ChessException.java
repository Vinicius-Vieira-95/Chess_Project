package chess;

import boardgame.BoardException;

public class ChessException extends BoardException{
	
	//exceção personalizada
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
