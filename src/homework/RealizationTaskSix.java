package homework;

import java.util.Scanner;

public abstract class RealizationTaskSix {

	public static void taskSixDescription(Scanner scanner) {
		System.out.println("This program finds the number of lucky tickets");
		taskSix(scanner);
	}
	public static void taskSix(Scanner scanner) {
		int min;
		int max;
		do {
			System.out.println("Please, enter the min number of the ticket");
			min = CheckIntInput.checkPositiveInput(scanner);
			System.out.println("Please, enter the max number of the ticket");
			max = CheckIntInput.checkPositiveInput(scanner);
		} while (!checkMinMax(min, max));
		FindLuckyTickets luckyTickets = new FindLuckyTickets(min, max);
		System.out.println("The winner is: " + luckyTickets.findWinMethod() + "\nThe number of lucky tickets in the 1st Methode: " + luckyTickets.getCountM1() + "\nThe number of lucky tickets in the 2nd Methode: " + luckyTickets.getCountM2());
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	public static boolean checkMinMax(int min, int max) {
		if (min > max | min > 999999 | max > 999999)
			return false;
		else
			return true;
	}
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskSix(scanner);
	}
}
