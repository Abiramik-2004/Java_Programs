package Demo1;
import java.util.*;
public class Merge {
	public static void main(String[] args) {
		int[] a= {10,20,40,30,80,50};
		int[] b= {60,20,80,90,100};
		System.out.println("Merging the array");
		System.out.println(Arrays.toString(merge(a,b)));
		System.out.println("Sorting the array:");
		System.out.println(Arrays.toString(sort(a)));
	}
	public static int[] merge(int[] a, int b[]) {
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int k=a.length;
		for(int j=0;j<b.length;j++) {
			c[k]=b[j];
			k++;
		}
		return c;
	}
	public static int[] sort(int[] a) {
		int i=0;
		int k=a.length;
		while(k>=i) {
			if(a[i]>=a[k]) {
				int temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				
			}
		}
	}
}
