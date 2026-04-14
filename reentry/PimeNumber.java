package reentry;
import java.util.Scanner;
public class PimeNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		boolean a=isPrime(n);
		if(a==true) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime Number");
		}
		sc.close();
;	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			
			}
			
		}
		return true;
	}

}
