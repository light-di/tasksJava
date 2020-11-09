package homework;

import java.util.Random;

public class Row {
	private int rowLength;
	private int minSquare;
	public Row() {
	}
	
	public void setRowLength(int length) {
		this.rowLength = length;
	}
	
	public void setMinSquare(int square) {
		this.minSquare = square;
	}
	
	public int getRowLength() {
		return rowLength;
	}
	
	public int getMinSquare() {
		return minSquare;
	}
	
	public String createRow() {
		int minNumb = (int)Math.sqrt((double)getMinSquare());
		int maxNumb = 46340;
		int diff = maxNumb - minNumb;
		Random random = new Random();

		String rowStr = "";
		for (int i = 0; i < getRowLength(); i++) {
			
			if (i < getRowLength() - 1)
				rowStr += (random.nextInt(diff + 1) + minNumb) + ", ";
			else 
				rowStr += (random.nextInt(diff + 1) + minNumb) + "";
		}
		return rowStr;
	}
}
