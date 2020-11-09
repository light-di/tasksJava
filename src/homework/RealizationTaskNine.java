package homework;

import java.util.Scanner;

public abstract class RealizationTaskNine {

	public static void taskNineDescription(Scanner scanner) {
		System.out.println("This program shows the chess board in the command line");
		taskNine(scanner);
	}
	
	public static void taskNine(Scanner scanner) {//является ли число полиндромом, вход - число, выход полиндром или ноль
		
		
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskNine(scanner);
	}

}
