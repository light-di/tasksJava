package homework;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int taskNum;
		do {
			System.out.println("Please, choose the number of the task 1-9");
			taskNum = CheckIntInput.checkPositiveInput(scanner);
		} while (taskNum > 9);
		
		switch (taskNum) {
		case 1:
			RealizationTaskOne.taskOneDescription(scanner);
			break;
		case 2:
			RealizationTaskTwo.taskTwoDescription(scanner);
			break;
		case 3:
			RealizationTaskThree.taskThreeDescription(scanner);
			break;
		case 4:
			RealizationTaskFour.taskFourDescription(scanner);
			break;
		case 5:
			RealizationTaskFive.taskFiveDescription(scanner);
			break;
		case 6:
			RealizationTaskSix.taskSixDescription(scanner);
			break;
		case 7:
			RealizationTaskSeven.taskSevenDescription(scanner);
			break;
		case 8:
			RealizationTaskEight.taskEightDescription(scanner);
			break;
		case 9:
			RealizationTaskNine.taskNineDescription(scanner);
			break;
		}
		System.out.println("If you want to choose anothe task enter y or yes");
		wantContinue(scanner); 
		scanner.close();
	} 
	public static void wantContinue(Scanner scanner) throws Exception {
		String[] mainStr = {"", ""};
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			main(mainStr);
	}
}
