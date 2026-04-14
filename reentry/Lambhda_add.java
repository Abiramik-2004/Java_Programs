package reentry;
interface Addition{
	int add(int a, int b);
}
interface Subract{
	int sub(int a, int b);
}
interface Multiplication{
	int mul(int a, int b);
}
interface Division{
	int div(int a, int b);
}
public class Lambhda_add {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		Addition ref1=(x, y)->{ return x+y; };
		Subract ref2=(x, y)->{ return x-y; };
		Multiplication ref3=(x, y)->{ return x*y; };
		Division ref4=(x, y)->{ return x/y; };
		System.out.println(ref1.add(a, b));
		System.out.println(ref2.sub(a, b));
		System.out.println(ref3.mul(a, b));
		System.out.println(ref4.div(a, b));
		
	}
}
