package reentry;
import java.util.*;
public class VowelCount {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ente the String: ");
		String s=sc.nextLine();
		int count=countVowel(s);
		System.out.println("The vowel total count: "+count);
		sc.close();
	}
	public static int countVowel(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if("aeiou".indexOf(Character.toLowerCase(s.charAt(i)))!=-1) {
				count++;
			}
	
		}
		return count;
	}
}
