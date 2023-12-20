package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessExeption;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true){
			try{
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);

				boolean[][] possiblesMoves = chessMatch.possiblesMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possiblesMoves);
				System.out.println();

				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);

				ChessPiece capturePiece = chessMatch.performerChessMove(source, target);
				}catch(ChessExeption e){
						System.out.println(e.getMessage());
						sc.nextLine();
				}catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
				}


		}
	}
}