package homework;

public class ChessBoard {
	private int width;
	private int height;
	
	public ChessBoard() {
	}

	public int getWidth() {
		return width;
	};
	
	public int getHeight() {
		return height;
	};
		
	public void setWidth(int width) {
		this.width = width;
	};
	
	public void setHeight(int height) {
		this.height = height;
	};
	
	public void showChessBoard() {
	    for (int i = 1; i <= getHeight(); i++) {
	      for (int j = 1; j <= getWidth(); j++) {
	        if (i % 2 != 0) {
	          if (j % 2 == 0)
	            System.out.print(" ");
	          else 
	            System.out.print("*");
	        }
	        else {
	          if (j % 2 == 0)
	            System.out.print("*");
	          else 
	            System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	
			
	}
}
