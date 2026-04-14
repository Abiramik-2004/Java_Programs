package reentry;
interface Shapes{
	public void draw();
}
class Square implements Shapes{
	public void draw() {
		System.out.println("Square drawing....");
	}
}
class Circle implements Shapes{
	public void draw() {
		System.out.println("Circle drawing....");
	}
}
public class Shape {
	public static void main(String[] args) {
		Square s=new Square();
		Circle c=new Circle();
		c.draw();
		s.draw();
	}
}
