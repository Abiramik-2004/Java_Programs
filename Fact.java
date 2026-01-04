import java.util.Scanner;
class Fact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=fact(num);
		System.out.println(result);
		}
	  public static int fact(int a){
		  if(a==0||a==1){
			  return 1;
		  }
		   else{
			   int result=a*fact(a-1);
			return result;}
		}
}
