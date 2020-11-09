package homework;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class RealizationTaskThree {

	public static void taskThreeDescription(Scanner scanner) {
		System.out.println("This program shows triangles in ascending order of their square");
		taskThree(scanner);
	}
	public static void taskThree(Scanner scanner) {
		ArrayList<Triangle> listTriangles = new ArrayList<Triangle>();
		System.out.println("If you want to add the triangle enter y or yes");
		wantAddTriangle(listTriangles, scanner);
		listTriangles = Sorting.sortTriangles(listTriangles);
		showTriangles(listTriangles);
		System.out.println("If you want to continue enter y or yes");
		wantContinue(scanner); 
	}

	public static Triangle newTriangle(Scanner scanner) {
		Triangle triangle = new Triangle();
		while (!initTriangle(triangle, scanner)) {
		}
		return triangle;
	}
	
	public static boolean initTriangle(Triangle triangle, Scanner scanner) {
		String triangleArguments[] = null;
		System.out.println("Please, input the triangle in the format \"name, sideA length, sideB length, sideC length\"");
		triangleArguments = checkNumTriangleArguments(scanner);
		if (checkTriangleSides(triangle, triangleArguments, scanner)) {
			triangle.setName(triangleArguments[0]);
			triangle.setSideA(Double.valueOf(triangleArguments[1]));
			triangle.setSideB(Double.valueOf(triangleArguments[2]));
			triangle.setSideC(Double.valueOf(triangleArguments[3]));
			if (checkExistenceTriangle(triangle, scanner)) return true;
			else return false;
		}
		else return false;
	}
	
	public static String[] checkNumTriangleArguments(Scanner scanner) {
		String triangleArguments[] = getTriangleArguments(scanner);
		while ((triangleArguments.length > 4) | (triangleArguments.length < 4)) {
			System.out.println("Wrong number of arguments");
			triangleArguments = getTriangleArguments(scanner);
		} 
		return triangleArguments;
	}
	
	public static String[] getTriangleArguments(Scanner scanner) {
		String triangleArguments[];
		String triangleInput = scanner.nextLine();
		triangleInput = triangleInput.replaceAll("\\s+", "");
		triangleArguments = triangleInput.split(",");
		return triangleArguments;
	}
	
	public static boolean checkTriangleSides(Triangle triangle, String[] triangleArguments, Scanner scanner) {
		for (int i = 1; i < triangleArguments.length; i++) {
			if (!isDouble(triangleArguments[i])) {
				System.out.println("The side isn't a double");
				return false;
			}
			if (Double.valueOf(triangleArguments[i]) < 1) {
				System.out.println("The side isn't positive - " + triangleArguments[i]);
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException | NullPointerException e) {
			return false;
		}
	}
	
	public static boolean checkExistenceTriangle(Triangle triangle, Scanner scanner) {
		if (!triangle.existTriangle()) {
			System.out.println("triangle isn't exist");
			return false;
		}
		else return true;
		
	}

	public static void wantAddTriangle(ArrayList<Triangle> listTriangles, Scanner scanner) {
		String answer = scanner.nextLine();
		while ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes"))) {
			listTriangles.add(newTriangle(scanner));
			System.out.println("If you want to add the triangle enter y or yes");
			answer = scanner.nextLine();
		}
			
	}
	
	public static void showTriangles(ArrayList<Triangle> listTriangles) {
		System.out.println("=====================Triangle list:=====================");
		for (int i = 0; i < listTriangles.size(); i++)
			System.out.printf("%d. [Triangle %s]: %.2f cm%n", i + 1, listTriangles.get(i).getName(),
					listTriangles.get(i).getSquare());
	}
	
	public static void wantContinue(Scanner scanner) {
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("y")) | (answer.equalsIgnoreCase("yes")))
			taskThree(scanner);
	}
}
