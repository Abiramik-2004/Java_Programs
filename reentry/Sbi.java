package reentry;
interface Rbi{
	public void setInterest();
}
interface Lon{
	public void applyLoan();
}
interface Kyc{
	public void updateKYC();
}
public class Sbi implements Rbi, Lon, Kyc {
	public void updateKYC() {
		System.out.println("Updating Kyc");
	}
	public void applyLoan() {
		System.out.println("Appying Loan");
	}
	public void setInterest() {
		System.out.println("Intrest setting");
	}
	public static void main(String[] args) {
		Rbi a=new Sbi();
		Lon b=new Sbi();
		Kyc c=new Sbi();
		c.updateKYC();
		b.applyLoan();
		a.setInterest();
		
	}
}
