import java.util.Scanner;
class  Sqre
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		double n=sc.nextDouble();
		double res=sqre(n);
		System.out.println(res);
	}
	public static double sqre(double n){
		double res=n*n;
		return res;
	}
}
