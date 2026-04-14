package reentry;
interface Engine{
	public void engineType();
}
interface  Company{
	public void brand();
}
class BMW implements Engine, Company {
	public void engineType() {
		System.out.println("This contains v8 engine ");
	}
	public void brand() {
		System.out.println("BMW");
	}
}
class Porsche implements Engine, Company {
	public void engineType() {
		System.out.println("This contains v9 engine ");
	}
	public void brand() {
		System.out.println("Porsche");
	}
}
public class CarClass  {
	public static void main(String args[]) {
		Engine e= new Porsche();
		Company c=new BMW();
		e.engineType();
		c.brand();
	}
}
