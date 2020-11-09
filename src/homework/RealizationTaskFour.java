package homework;

import java.io.*;
import java.util.Scanner;

public abstract class RealizationTaskFour {
	
	public static void taskFourDescription(Scanner scanner) throws Exception {
		System.out.println("This program counts strings in the file or replaces entered strings");
		taskFour(scanner);
	}
	public static void taskFour(Scanner scanner) throws Exception {
		int selectedMode;
		File userFile = openFile(scanner);
		Scanner fileScan = new Scanner(userFile); //for reading file content
		System.out.println("Please, choose the selectedMode:\n1 - counting strings in the file;\n2 and more - Replace strings in the file");	
		selectedMode = CheckIntInput.checkPositiveInput(scanner);
		if (selectedMode == 1) 
			modeOne(scanner, fileScan);
		else 
			modeTwo(scanner, fileScan, userFile);
		fileScan.close(); 
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}
	
	public static File openFile(Scanner scanner) {
		String filePath;
		String fileName;
		File userFile; 
		do {
			System.out.println("Please, enter the file path"); //Entering file path
			filePath = scanner.nextLine();
			fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
			filePath = filePath.replace("/" + fileName, "");
			userFile = new File(filePath, fileName);
		} while (!checkFile(userFile));
		return userFile;
	}
	
	public static boolean checkFile(File userFile) {
		if(!userFile.isFile()) {
			System.out.println("The file isn't exist");
			return false;
		}
		if(!userFile.canRead()) {
			System.out.println("The file isn't readable");
			return false;
		}
		if(!userFile.canWrite()) {
			System.out.println("The file isn't writable");
			return false;
		}		
		return true;
	}

	public static void modeOne(Scanner scanner, Scanner fileScan) {
		System.out.println("Please, enter the string for counting");
		System.out.println("Count = " + fileScan.findAll(scanner.nextLine()).count());
	}
	
	public static void modeTwo(Scanner scanner, Scanner fileScan, File userFile) throws Exception {
		System.out.println("Please, enter the string for searching");
		String userStr = scanner.nextLine();
		System.out.println("Please, enter the string for replacing");
		String userStrNew = scanner.nextLine();
		replaceString(userStr, userStrNew, fileScan, userFile);
	}
	
	public static void replaceString(String userStr, String userStrNew, Scanner fileScan, File userFile) throws Exception {
		FileWriter tempFile = new FileWriter(userFile.getPath().replace(userFile.getName(), "") + "temp.txt");
		while(fileScan.hasNextLine()) //writing edited content to the new file
			tempFile.write(fileScan.nextLine().replace(userStr, userStrNew) + "\n");
		tempFile.close();
		File newUserFile = new File(userFile.getPath().replace(userFile.getName(), "") + "temp.txt");
		userFile.delete();
		newUserFile.renameTo(userFile);	
		System.out.println("The string was replaced successfully");
	}
	
	public static void wantContinue(Scanner scanner) throws Exception {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskFour(scanner);
	}

}
