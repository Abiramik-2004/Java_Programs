package Demo1;
import java.util.*;
public class SecndLargest {
	public static void main(String[] args) {
		int[] ar={10,20,40,80,69,78};
		int l=ar[0];
		int sl=Integer.MIN_VALUE;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>l) {
				sl=l;
				l=ar[i];
				
			}
			else {
				sl=Math.max(sl,ar[i]);
			}
		}
		System.out.println("Second largest: "+sl);
	}
	
}
