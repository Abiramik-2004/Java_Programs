package reentry;
import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		boolean res=isAmstrong(n);
		System.out.println(res);
		sc.close();
	}
	public static boolean isAmstrong(int n) {
		double res=0,count=0;
		int r=n,t=n;
		while(r>0) {
			count++;
			r=r/10;
		}
		while(n>0) {
			int q=n%10;
			n=n/10;
			res=res+Math.pow(q, count);
		}
		return res==t;
	}
}
