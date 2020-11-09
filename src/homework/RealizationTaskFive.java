package homework;

import java.util.Scanner;

public abstract class RealizationTaskFive {

	public static void taskFiveDescription(Scanner scanner) {
		System.out.println("This program writes the number in letters");
		taskFive(scanner);
	}
	public static void taskFive(Scanner scanner) {
		int number;
		System.out.println("Please, enter the number");
		CheckIntInput.checkInput(scanner);
		number = scanner.nextInt();
		scanner.nextLine(); //reading /n
		System.out.print(number + " - ");
		if (number < 0) {
			System.out.print("minus ");
			number = number * (-1);
		}
		System.out.print(ParseNumber.parseNumber(number) + "\n");
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskFive(scanner);
	}
}
