class SubArraySum 
{
	public static void sumArray(int a[]){
		
		for(int i=0;i<a.length;i++){
			for(int j=a.length-1;j>i;j++){
				int count=0;
				for(int k=i;k<j;k++){
					System.out.print(a[k]);
				}
				System.out.print("\t");
			}
		}
				
					
	}
	public static void main(String[] args) 
	{
		int[] a={2,-1,-3,2,4};
		sumArray(a);
	}
}
