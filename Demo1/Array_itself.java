package Demo1;
import java.util.*;
public class Array_itself {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b=new int[a.length];
		int[] c=new int[a.length];
		b[0]=1;
		c[c.length-1]=1;
		for(int i=1;i<b.length;i++) {
			b[i]=b[i-1]*a[i-1];
		}
		for(int i=c.length-2;i>=0;i--) {
			c[i]=c[i+1]*a[i+1];
		}
		for(int i=0;i<a.length;i++) {
			a[i]=c[i]*b[i];
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(a));
	}
}
