
public class Knight extends Characters{

	public Knight() {
		this(130,55,0,130);
	}

	public Knight(int healthStat, int attackStat, int gold, int maxHealth) {
		super(healthStat, attackStat, gold, maxHealth);
		
	}
	
	public void cattack1(Enemy enemy) {
		System.out.println("Knight used Sword Slash");
		if(Math.random()<0.9) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack2(Enemy enemy) {
		System.out.println("Knight used Sword Pierce");
		if(Math.random()<0.8) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack3(Enemy enemy) {
		System.out.println("Knight used Shield Bash");
			enemy.takeDamage((int)((getAttackStat())*0.90));
			System.out.println("It did " + (int)((getAttackStat())*0.90) + " damage");
	}
	
	public void cattack4(Enemy enemy) {
		System.out.println("Knight used Quick Cleave");
		if(Math.random()<0.93) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
}
