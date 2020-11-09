package homework;

import java.util.Scanner;

public abstract class CheckIntInput {

	public static void checkInput(Scanner scanner) {
		while (!scanner.hasNextInt())
		{
			System.out.println("Wrong data, try again");
			scanner.nextLine();
		}
	}
	
	public static int checkPositiveInput(Scanner scanner) {
		checkInput(scanner); 
		int positiveNum = scanner.nextInt();
		scanner.nextLine(); //reading /n

		while (positiveNum < 1)
		{
			System.out.println("Wrong data, try again");
			checkInput(scanner); 
			positiveNum = scanner.nextInt();
			scanner.nextLine();
		}
		return positiveNum;
	}

}
