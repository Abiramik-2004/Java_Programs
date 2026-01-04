class Twosum 
{
	public static void main(String[] args) 
	{
		int arr[]={4,8,1,2,6,7};
		twoSum(arr);
	}
	public static void twoSum(int[] a){
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if((a[i]+a[j])==10){
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
}
