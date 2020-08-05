package Package1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		System.out.println("Input side1 of rectangle: ");
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		sc.nextLine();
		double side2 = sc.nextDouble();
		sc.close();
		
		rectangle.setSide1(side1);
		rectangle.setSide2(side2);
		
		rectangle.areaCalculator();
		rectangle.perimetrCalculator();
		
		System.out.println("Area this rectangle = " + rectangle.getArea());
		System.out.println("Perimetr this rectangle = " + rectangle.getPerimetr());
	}

}
