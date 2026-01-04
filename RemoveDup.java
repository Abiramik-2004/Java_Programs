import java.util.Scanner;
class  RemoveDup
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String: ");
		String s=sc.nextLine();
		String res=solve(s);
		System.out.println("After the removal of duplication: "+res);	
	}
	public static String solve(String s){
		char a[] =s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					a[j]='\0';
					count++;
				}
			}
		}
		char temp[]=new char[a.length-count];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!='\0'){
				temp[k++]=a[i];
			}
		}
		s=new String(temp);
		return s;
	}
}
