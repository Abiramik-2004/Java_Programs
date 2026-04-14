package reentry;
import java.util.*;
public class Week {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length  of an array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter th elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}
