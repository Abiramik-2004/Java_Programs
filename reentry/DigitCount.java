package reentry;
import java.util.*;
public class DigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to count the digit");
		int n=sc.nextInt();
		int count=digitCount(n);
		System.out.println("Count : "+count);
		sc.close();
	}
	public static int digitCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
			
		}
		return count;
	}
	

}
