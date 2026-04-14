package Demo1;
public class AfterSmall {
	public static void main(String[] args) {
		int[] a= {5,2,6,1};
		for(int i=0;i<a.length;i++) {
			int j=i+1;
			int count=0;
			while(j<a.length) {
				if(a[i]>a[j]) {
					count++;
					j++;
				}
				else {
					j++;
				}
				
			}
			System.out.println(a[i]+"has "+count+"Smaller numbers");
		}
	}
}
