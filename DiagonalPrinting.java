import java.util.Scanner;
class  DiagonalPrinting
{			
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int a[][]=new int[n][n]; 
		int i,j;
		System.out.println("enter the vaue for matrix:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("the matrix is:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("The main diagonal:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i==j){
					System.out.print(a[i][j]+"\t");
				}
			}
		}
		System.out.println();
		System.out.println("the side diagnals");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i<=j){
					System.out.print(a[i][n-i-1]+"\t");
					break;
				}
			}
		}
	}
}
