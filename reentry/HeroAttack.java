package reentry;
interface Hero{
	public void attack();
}
class Warrior implements Hero{
	public void attack(){
		System.out.println("Attacking by Warrior");
	}
}
class Archer implements Hero{
	public void attack(){
		System.out.println("Attacking by Archer");
	}
}
class Mage implements Hero{
	public void attack(){
		System.out.println("Attacking by Mage");
	}
}
public class HeroAttack {
	public static void main(String[] args) {
		Hero w=new Warrior();
		Hero A=new Archer();
		Hero M=new Mage();
		w.attack();
		A.attack();
		M.attack();
	}
}
