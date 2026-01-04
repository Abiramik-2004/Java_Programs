import java.util.Scanner;
class  IsLonger
{
	public static void isLonger(CharSequence s1, CharSequence s2){
		int sl1=s1.length();
		int sl2=s2.length();
		if(sl1>sl2){
			System.out.println("String1 is largest");
		}
		else{
			System.out.println("String2 is Largest");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String1");
		String s1=sc.nextLine();
		System.out.println("enter the String2");
		String s2=sc.nextLine();
		isLonger(s1,s2);
	}
}
