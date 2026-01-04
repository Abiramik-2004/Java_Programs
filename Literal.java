import java.util.Scanner;
class LookAndSay{
	static String nextTerm(String term){
		StringBuilder result=new StringBuilder();
		int count=1;
		char current=term.charAt(0);
		for(i=1;i<term.length();i++){
			if(term.charAt(i)==current){
				count++;
			}
			else{
				result.append(count).append(current);
				current=term.charAt(i);
				count=1;
			}
			result.append(count).append(current);
			return result.toString();
		}
		
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		String term="1";
		System.out.println(term);
		for(i=0;i<n;i++){
			nextTerm(term);
		}
		System.out.println(term);
		}
	}
	