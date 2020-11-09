package homework;

import java.util.Scanner;

public abstract class RealizationTaskOne {

	public static void taskOneDescription(Scanner scanner) {
		System.out.println("This program shows the chess board in the command line");
		taskOne(scanner);
	}
	
	public static void taskOne(Scanner scanner) {
		ChessBoard chessBoard = new ChessBoard();
		System.out.println("Please, input the size of the chess board");
		System.out.println("Width = ");
		chessBoard.setWidth(CheckIntInput.checkPositiveInput(scanner));
		System.out.println("Height = ");
		chessBoard.setHeight(CheckIntInput.checkPositiveInput(scanner));
		chessBoard.showChessBoard();
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskOne(scanner);
	}
}
