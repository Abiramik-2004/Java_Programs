import java.util.Scanner;
class  LoT
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("number1");
		
		int a=sc.nextInt();
		System.out.println("number2");
		int b=sc.nextInt();
		System.out.println("number3");
		int c=sc.nextInt();
		int res=lot(a,b,c);
		System.out.println(res);
	}
	public static int lot(int a, int b, int c){
		int res=0;
		if(a<b){
			if(b>c){
				res=b;
			}
		}
		else if(a>b){
			if(a>c){
				res=a;
			}
		}
		else{
		  res=c;
			}
		return res;
	}
}
