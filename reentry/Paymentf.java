package reentry;
interface Payment{
	public void pay();
}
class UPI implements Payment{
	public void pay() {
		System.out.println("Payment by UPI");
	}
}
class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment by CreditCard");
	}
}
class NetBanking implements Payment{
	public void pay() {
		System.out.println("Payment by NetBanking");
	}
}
public class Paymentf {
	public static void main(String[] args) {
		Payment p=new UPI();
		Payment c=new CreditCard();
		Payment d=new NetBanking();
		p.pay();
		c.pay();
		d.pay();
	}
}
