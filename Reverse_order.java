import java.util.Scanner;
class  Reverse_order
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to print the square matrix: ");
		int n=sc.nextInt();
		int a[][]=new a[n][n];
		num=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[][]=num++;
			}
		}
		System.out.println("the reversed matrix");
		for(int i=n-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				System.out.print(a[i][j]);
			}
		}
	}
}
