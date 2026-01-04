import java.util.Scanner;
class LetterCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		solve(s);
	}
	public static void solve(String s){
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		int j=0;
		while(j<a.length){
			int count=1;
			for(int i=j+1;i<a.length;i++){
				if(a[i]==a[j]){
					count++;
				}
			}
			System.out.println(a[j]+" : "+count); 
			j++;
		}
	}
			
}
