package aplication;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chess = new ChessMatch();
		
		while(true) {
		
		UI. printBoard(chess.getPieces());
		System.out.println();
		
		System.out.println("Source");
		ChessPosition source = UI.readChessPostion(sc);
		System.out.println();
		
		System.out.println("Target");
		ChessPosition target = UI.readChessPostion(sc);
		
		ChessPiece capturedPiece = chess.performChessMove(source, target);
		
		}
		
		
		
	}

}
