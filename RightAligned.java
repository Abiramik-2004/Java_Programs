import java.util.Scanner;
public class RightAligned
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
		    for(int space=1;space<=n-i;space++){
		        System.out.print(" ");
		    }
		  
		    for(int star=1;star<=i;star++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}