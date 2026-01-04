import java.util.Scanner;
class Prime_number 
{
	static Boolean primeNumber(int num){
		if(num<2){
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the matrix num:");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int num =2;
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				while(true){
					if(primeNumber(num)){
						arr[i][j]=num;
					    num++;
					    break;
				}num++;
		}
			}
		}
		System.out.println("The prime number in matrix form");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("the prime number matrix in 1D way of printing:");
		int k=0;
		int a[]=new int[n*n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[k]=arr[i][j];
				System.out.print(a[k]+"\t");
				k++;
			}
		}
		}
		
}
