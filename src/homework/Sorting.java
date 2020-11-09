package homework;

import java.util.ArrayList;

public abstract class Sorting {
	//public Sorting() {}
	public static ArrayList<Triangle> sortTriangles(ArrayList<Triangle> arrayTriangles) {
		for (int i = 0; i < arrayTriangles.size() - 1; i++) {
			for (int j = 0; j < arrayTriangles.size() - i - 1; j++) {
				if (arrayTriangles.get(j).getSquare() < arrayTriangles.get(j+1).getSquare()) {
					Triangle temp = arrayTriangles.get(j);
					arrayTriangles.set(j, arrayTriangles.get(j+1));
					arrayTriangles.set(j+1, temp);
				}
			}
		}
		return arrayTriangles;
	}
}
