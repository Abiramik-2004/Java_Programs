import java.util.*;
class ReverseCharArray
{
	public static void main(String args[]){
		char[] c={'a', 'b','c','d','e'};
		System.out.println(Arrays.toString(c));
		reverse(c);
		System.out.println(Arrays.toString(c));
	}
	public static char[] reverse(char[] c){
		int a=0;
		int b=c.length-1;
		while(a<b){
			char temp=c[a];
			c[a]=c[b];
			c[b]=temp;
			a++;
			b--;
	}
	return c;
	}
}
