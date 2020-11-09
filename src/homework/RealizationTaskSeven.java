package homework;
import java.util.Scanner;
public abstract class RealizationTaskSeven {

	public static void taskSevenDescription(Scanner scanner) {
		System.out.println("This program shows the row of natural numbers, the square of which is bigger than or equal to the entered");
		taskSeven(scanner);
	}
	
	public static void taskSeven(Scanner scanner) {
		int minSquare;
		Row row = new Row();
		System.out.println("Please, enter the length of the row");
		row.setRowLength(CheckIntInput.checkPositiveInput(scanner)); 
		do {
			System.out.println("Please, enter the min square");
			minSquare = CheckIntInput.checkPositiveInput(scanner);
		} while ((Math.sqrt((double)minSquare) - (int)Math.sqrt((double)minSquare)) != 0); //check is it square from natural number
		row.setMinSquare(minSquare);
		System.out.println("Created row: " + row.createRow()); 
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskSeven(scanner);
	}
}
