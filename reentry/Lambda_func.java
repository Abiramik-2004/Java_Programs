package reentry;
@FunctionalInterface
interface Car1{
	void start();
}
public class Lambda_func {
	public static void main(String args[]) {
		Car1 ref=()->{System.out.println("car start");};
		ref.start();
	}
}
