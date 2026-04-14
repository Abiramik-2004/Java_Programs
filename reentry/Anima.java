package reentry;
interface Animal {
	public void sound();
}
class Cat implements Animal {
	@Override
	public void sound() {
		System.out.println("Cat meows....");
	}
	
}
class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks....");
	}
}
public class Anima{
	public static void main(String arg[]) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.sound();
		d.sound();
		
	}
}
