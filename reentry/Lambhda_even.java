package reentry;
import java.util.*;
interface Numcheck{
	public String oddoreven(int a);
}
class Check implements Numcheck{
	public String oddoreven(int a) {
		if(a%2==0)
			return "Even";
		else
			return "Odd";
	}
}
public class Lambhda_even {
	public static void main(String arg[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to check:");
		int n=sc.nextInt();
		Numcheck ref=(a)->{
			if(a%2==0)
				return "Even";
			else
				return "Odd";
		};
		System.out.println(ref.oddoreven(n));
		Check obj = new Check();
		Numcheck ref2= obj::oddoreven;
		System.out.println(ref2.oddoreven(n));
		
		
	}
}
