package reentry;
interface Vechicle{
	public void start();
}
class Bike implements Vechicle{
	public void start() {
		System.out.println("Bike starts.......");
	}
}
class Car implements Vechicle{
	public void start() {
		System.out.println("Car starts.......");
	}
}

public class Vechica {
	public static void main(String args[]) {
		Bike b=new Bike();
		Car c=new Car();
		b.start();
		c.start();
		
	}
}
