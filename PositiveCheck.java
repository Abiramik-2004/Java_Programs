import java.util.Scanner;
class PostiveCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n=sc.nextInt();
		if(n>0){
			System.out.println("it is positive");
		}
		else{
			System.out.println("it is negative");
		}
			
	}
}
