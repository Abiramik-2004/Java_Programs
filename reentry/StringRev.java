package reentry;
import java.util.*;
public class StringRev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to be reversed: ");
		String s=sc.nextLine();
		System.out.println("The String before reverse: "+s);
		String rev=stringRev(s);
		System.out.println("The sring after reversed: "+rev);
		String arr=strRev(s);
		System.out.println("The reversed string using Character array: "+arr);
		
		sc.close();
	}
	public static String stringRev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
		
	}
	public static String strRev(String s) {
		char[] arr=s.toCharArray();
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev+=arr[i];
		}
		return rev;
	}
		
	

}
