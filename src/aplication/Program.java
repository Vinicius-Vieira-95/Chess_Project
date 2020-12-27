package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chess = new ChessMatch();

		while (true) {

			try {
				UI.clearScreen();
				System.out.println();
				UI.printMatch(chess);
				System.out.println();
	
				System.out.println("Source");
				ChessPosition source = UI.readChessPostion(sc);
				
				boolean[][] possibleMoves = chess.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chess.getPieces(),possibleMoves );
				
				
				System.out.println();
	
				System.out.println("Target");
				ChessPosition target = UI.readChessPostion(sc);
	
				ChessPiece capturedPiece = chess.performChessMove(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}

}
