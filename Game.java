import java.util.Scanner;
class Game 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------Welcome to the Number Guessing game----");
		
		Boolean flag=true;
		int count=0;
		do
		{
		int num=(int)(Math.random()*9+9);
		System.out.println(num);
		System.out.println("enter your guessing");
		int n=sc.nextInt();
		
		if(n==num){
			System.out.println("your guessing is correct and you found at "+count+" attemp");
		}
		else if(num>n){
			System.out.println("Too Low....keep trying!");
			count++;
		}
		else{
			System.out.println("Too High....keep trying!");
			count++;
		}
		System.out.println("Do you want to continue(1.yes/2.no)...");
		int ne =sc.nextInt();
		switch(ne){
			case 1:
				flag=true;
			break;
			case 2:
				flag=false;
			break;
		}
	
		}
		while (flag);
		System.out.println("thank you for playing this game!");
	}
}
