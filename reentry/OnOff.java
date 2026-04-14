package reentry;
interface RemoteControl {
	public void on();
	public void off();
}
class TV implements RemoteControl{
	public void on() {
		System.out.println("Tv is on");
	}
	public void off() {
		System.out.println("TV is off");
	}
}
class AC implements RemoteControl{
	public void on() {
		System.out.println("AC is on");
	}
	public void off() {
		System.out.println("AC is off");
	}
}
public class OnOff {
	public static void main(String[] args) {
		RemoteControl r=new AC();
		RemoteControl c=new TV();
		r.on();
		r.off();
		c.on();
		c.off();
	}
	
}
