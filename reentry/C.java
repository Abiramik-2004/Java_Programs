package reentry;
interface A{
	public void show();
}
interface B{
	public void show();
}
public class C implements A,B {
	@Override
	public void show() {
		System.out.println("it is showing");
	}
	public static void main(String[] args) {
		C c=new C();
		c.show();
	}
}
