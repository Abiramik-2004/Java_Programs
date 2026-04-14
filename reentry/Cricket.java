package reentry;
interface Sport{
	public void play();
}
interface TournmentRules{
	public void rules();
}
public class Cricket implements Sport, TournmentRules {
	public void rules(){
		System.out.println("Playing");
	}
	public void play() {
		System.out.println("This the rules");
	}
	public static void main(String args[]) {
		Cricket c=new Cricket();
		c.rules();
		c.play();
	}
}
