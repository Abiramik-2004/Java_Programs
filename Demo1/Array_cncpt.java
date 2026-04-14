package Demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_cncpt {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length  of an array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter th elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("printing using he conversion of String method");
		System.out.println(Arrays.toString(arr));
		System.out.println("Using for loop");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Using for each loop");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("Sum of the Arrays");
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		sc.close();
		System.out.println("Reversing an array:");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Reversing array using two variables");
		int l=0;
		int m=n-1;
		while(l<m) {
			int temp=arr[l];
			arr[l]=arr[m];
			arr[m]=temp;
			l++;
			m--;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Adding prime number present inside the array: ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				count+=arr[i];
			}
		}
		System.out.println(count);
		
	}
	public static boolean isPrime(int num) {
		if(num>1) {
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(num%j==0) {
					return false;
				}
				return true;
				
			}
			
			
		}
		return false;
	}
}
