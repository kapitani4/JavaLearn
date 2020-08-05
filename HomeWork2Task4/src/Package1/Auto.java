package Package1;

public class Auto {
	int year;
	double speed;
	int weight;
	String color;
	
	public Auto(int year) {
		// TODO Auto-generated constructor stub
		this.year = year;
	}
	public Auto(int year, double speed) {
		// TODO Auto-generated constructor stub
		this(year);
		this.speed = speed;
	}
	public Auto(int year, double speed, int weight) {
		// TODO Auto-generated constructor stub
		this(year, speed);
		this.weight = weight;
	}
	public Auto(int year, double speed, int weight, String color) {
		// TODO Auto-generated constructor stub
		this(year, speed, weight);
		this.color = color;
	}
	
}
