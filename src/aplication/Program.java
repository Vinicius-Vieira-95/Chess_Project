package aplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Olá bebê");

		Scanner sc = new Scanner(System.in);
		ChessMatch chess = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();

		while (!chess.getCheckMate()) {

			try {
				UI.clearScreen();
				System.out.println();
				UI.printMatch(chess, captured);
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
				
				if(capturedPiece != null) {
					captured.add(capturedPiece);
				}
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
		UI.clearScreen();
		UI.printMatch(chess, captured);
		
	}

}
