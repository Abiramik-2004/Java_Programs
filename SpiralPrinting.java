import java.util.Scanner;
class  SpiralPrinting
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value of matrix:");
		int n=sc.nextInt();
		int i,j;
		int a[][]=new int[n][n];
		System.out.println("enter the value:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		i = 0;
while(i < n){
    if(i % 2 == 0){
        for(j = 0; j < n; j++){
            System.out.print(a[i][j] + " ");
        }
		System.out.println();
    }
    else{
        for(j = n - 1; j >= 0; j--){
            System.out.print(a[i][j] + " ");
        }
		System.out.println();
    }
    i++;
}

	}
}
