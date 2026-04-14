package reentry;
import java.util.*;
interface Calculator{
	public void add(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
	public void sub(int a, int b);
}
public class Calci implements Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void div(int a, int b) {
		System.out.println(a/b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int val1=sc.nextInt();
		System.out.print("Enter the num2: ");
		int val2=sc.nextInt();
		System.out.print("Enter the option(a/s/d/m): ");
		char i=sc.next().charAt(0);
		Calci c=new Calci();
		switch(i) {
		case 'a'->c.add(val1,val2);
		case 's'->c.sub(val1, val2);
		case 'd'->c.div(val1, val2);
		case 'm'->c.mul(val1, val2);
		default->System.out.println("Inavalid option");
		}
		
	}
}
