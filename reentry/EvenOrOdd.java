package reentry;
import java.util.*;
public class EvenOrOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		String s=(n%2==0)?"Even":"Odd";
		System.out.println(s);
		sc.close();
		
	}
}
