import java.util.Scanner;
class SubSeqExtract 
{
	static Scanner sc=new Scanner(System.in);
	public static void seqExtract(CharSequence s){
	
		System.out.println("enter the starting index for extraction(0-" +(s.length()-1 ) +") : ");
		int start=sc.nextInt();
		
		System.out.println("enter the Ending index for extraction(0-"+ (s.length()-1 ) +") : ");
		int end=sc.nextInt();
		System.out.println("the substring is "+s.subSequence(start,end+1));
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		seqExtract(s);
	}
}
