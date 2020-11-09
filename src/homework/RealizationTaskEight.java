package homework;

import java.util.Scanner;

public abstract class RealizationTaskEight {

	public static void taskEightDescription(Scanner scanner) {
		System.out.println("This program shows the chess board in the command line");
		taskEight(scanner);
	}
	
	public static void taskEight(Scanner scanner) { //вывести числа Фебоначчи которые имеют длину или находятся в диапазоне
		
		
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskEight(scanner);
	}
}
