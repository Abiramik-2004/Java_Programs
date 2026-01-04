import java.util.*;
class AddArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=sum(a);
		System.out.println("The sum of array is "+sum);
	}
	public static int sum(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		return sum;
	}
}
