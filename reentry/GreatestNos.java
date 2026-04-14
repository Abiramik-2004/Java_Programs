package reentry;
import java.util.*;
public class GreatestNos {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enterthe no 1: ");
		int a=sc.nextInt();
		System.out.print("Enter the number 2: ");
		int b=sc.nextInt();
		System.out.print("enter the number 3: ");
		int c=sc.nextInt();
		String s= (a>b)?((a>c)?"a is greater":"c is greater"):((b>c)?"b is greater":"c is greater");
		System.out.println(s);
		sc.close();	
	}
	
}
