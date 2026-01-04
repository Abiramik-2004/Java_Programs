import java.util.Scanner;
class DiamondPattern{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enterthe n value:");
		int n=sc.nextInt();
		int i,j;
		int m=n-1;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(" ");
			}
			System.out.println();
			for(j=0;j<=m;j++){
				System.out.print("*");
			}
			m--;
		}
		int space=0;
		for(i=n-1;i>=0;i--){
			for(j=0;j>=space;j++){
				System.out.print("*");
			}
			System.out.println();
			for(j=0;j<space;j++){
				System.out.print(" ");
			}
		}
	}
}
