package Package1;

public class Rectangle {
	private double side1;
	private double side2;
	private double area;
	private double perimetr;
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	
	
	void areaCalculator() {
		area = side1*side2;
	}
	void perimetrCalculator() {
		perimetr = (side1+side2)*2;
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimetr() {
		return perimetr;
	}
}
