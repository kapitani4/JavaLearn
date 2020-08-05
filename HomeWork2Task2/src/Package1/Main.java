package Package1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto(2010);
		Auto auto2 = new Auto(2015, "Blue");
		
		System.out.printf("Авто 1 - год выпуска: %d\n", auto1.year);
		System.out.printf("Авто 2 - год выпуска: %d цвет: %s\n", auto2.year, auto2.color);
	}

}
