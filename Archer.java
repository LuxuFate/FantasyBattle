
public class Archer extends Characters {
	
	public Archer() {
		this(110,60,0,110);
	}

	public Archer(int healthStat, int attackStat, int gold, int maxHealth) {
		super(healthStat, attackStat, gold, maxHealth);
		
	}
	
	public void cattack1(Enemy enemy) {
		System.out.println("Archer used Rain of Arrows");
		enemy.takeDamage((int)((getAttackStat())*0.8));
		System.out.println("It did " + (int)((getAttackStat())*0.8) + " damage");
	}
	
	public void cattack2(Enemy enemy) {
		System.out.println("Archer used Piercing Shot");
		if(Math.random()<0.85) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack3(Enemy enemy) {
		System.out.println("Archer used Explosive Arrow");
		if(Math.random()<0.75) {
			enemy.takeDamage((int)((getAttackStat())*1.1));
			System.out.println("It did " + (int)((getAttackStat())*1.1) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack4(Enemy enemy) {
		System.out.println("Archer used Bow Strike");
		enemy.takeDamage((int)((getAttackStat())*0.9));
		System.out.println("It did " + (int)((getAttackStat())*0.9) + " damage");
	}

}
