package homework;

public class Triangle {
	private String name;
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle() {
	}
	
	public String getName() {
		return name;
	};
	
	public double getSideA() {
		return sideA;
	};
		
	public double getSideB() {
		return sideB;
	};
	
	public double getSideC() {
		return sideC;
	};
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	};
		
	public void setSideB(double sideB) {
		this.sideB = sideB;
	};
	
	public void setSideC(double sideC) {
		this.sideC = sideC;
	};
	
	public double getSquare() {
		double perimeter = (this.getSideA() + this.getSideB() + this.getSideC()) / 2; 
		double square = Math.sqrt(perimeter * (perimeter - this.getSideA()) * (perimeter - this.getSideB()) * (perimeter - this.getSideC()));
		return square;
	};
	
	public boolean existTriangle() {
		if ((this.getSideA() + this.getSideB() > this.getSideC()) & (this.getSideA() + this.getSideC() > this.getSideB()) & (this.getSideB() + this.getSideC() > this.getSideA()))
		    return true;
		else
			return false;
	}
}
