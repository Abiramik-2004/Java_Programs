import java.util.Scanner;
class Ascii 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char a= sc.next().charAt(0);
		int res=ascii(a);
		System.out.println(res);
	}
	public static int ascii(char num){
		int res=num;
		return res;
	}
}
