
public class Assassin extends Characters{
	
	public Assassin() {
		this(100,65,0,100);
	}

	public Assassin(int healthStat, int attackStat, int gold, int maxHealth) {
		super(healthStat, attackStat, gold, maxHealth);
		
	}
	public void cattack1(Enemy enemy) {
		System.out.println("Assassin used Blade Throw");
		if(Math.random()<0.9) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack2(Enemy enemy) {
		System.out.println("Assassin used Venom Dart");
		if(Math.random()<0.91) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack3(Enemy enemy) {
		System.out.println("Assassin used Shadow Strike");
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
	}
	
	public void cattack4(Enemy enemy) {
		System.out.println("Assassin used Mantis Slash");
		if(Math.random()<0.8) {
			enemy.takeDamage((int)((getAttackStat())*1.15));
			System.out.println("It did " + (int)((getAttackStat())*1.15) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	

}
