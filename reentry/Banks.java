package reentry;
interface Bankd{
	public void rateOfInterest();
}
class SBI implements Bankd{
	public void rateOfInterest() {
		System.out.println("have 0.2% interest");
	}
}
class HDFC implements Bankd{
	public void rateOfInterest() {
		System.out.println("have 0.4% interest");
		
	}
}
class ICICI implements Bankd{
	public void rateOfInterest() {
		System.out.println("have 0.5% interest");
		
	}
}
public class Banks {
	public static void main(String args[]) {
		
		Bankd b1 = new SBI();
        Bankd b2 = new HDFC();
        Bankd b3 = new ICICI();
        b1.rateOfInterest();
        b2.rateOfInterest();
        b3.rateOfInterest();
		
		
		
	}
}
