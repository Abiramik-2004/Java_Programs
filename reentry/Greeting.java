package reentry;
interface Greet {
	public void sayHello();
}
public class Greeting implements Greet {
	public void sayHello() {
		System.out.println("Hello eveyone");
	}
	public static void main(String args[]) {
		Greeting g= new Greeting();
		g.sayHello();
	}
}
