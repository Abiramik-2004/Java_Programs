package reentry;
import java.util.*;
public class GenerateFibo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc. nextInt();
		fibSeries(n);
		sc.close();
	}
	public static void fibSeries(int n) {
		int a=0,b=1;
		System.out.print("Fibo series: "+a+" "+b);
		for(int i=0;i<n-2;i++) {
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
