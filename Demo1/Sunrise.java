package Demo1;
import java.util.Arrays;
public class Sunrise {
	public static void main(String[] args) {
		int[] a= {3,4,1,2,5,7,4,9};
		int max=a[0];
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				count++;
				max=a[i];
			}
		}
		System.out.println(count);
	}
}
