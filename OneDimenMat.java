import java.util.Scanner;
class  OneDimenMat{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n vale:");
		int n= sc.nextInt();
		int i,j;
		int num=1;
		int a[][]=new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=num;
				num++;
			}
		}
		int k=1;
		int ar[]=new int[n*n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
			    ar[k]=a[i][j];
				k++;
			}
		}
		System.out.println("the flattened reverse:");
		while(k>0){
			System.out.print(a[k]);
			k--;
		}
	}
}
