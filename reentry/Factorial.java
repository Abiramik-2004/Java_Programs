package reentry;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number to find the factorial: ");
		int n=sc.nextInt();
		int res=factorial(n);
		System.out.println("The factorial of "+n+" number is "+res);
		sc.close();
		
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
		
	}
}
