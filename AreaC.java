import java.util.Scanner;
class AreaC 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=sc.nextDouble();
		double res=area(r);
		System.out.println(res);
	}
	public static double area(double r){
		double pi=3.14;
		double res=pi*r*r;
		return res;
	}
}
