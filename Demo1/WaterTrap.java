package Demo1;
import java.util.*;
public class WaterTrap {
	public static void main(String[] args) {
		int[] a= {0,1,0,2,1,0,1,3,2,1,2,1};
		int n=a.length;
		int right[]=new int[n];
		int left[]=new int[n];
		left[0]=a[0];
		right[n-1]=a[n-1];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1],a[i]);
		}
		for(int j=n-2;j>=0;j--) {
			right[j]=Math.max(right[j+1],a[j]);
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		int[] wl=new int[n];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			wl[i]=Math.min(left[i], right[i]);
			sum+=(wl[i]-a[i]);
		}
		System.out.println(sum);
		
	}
}
