
public class Mage extends Characters{
	
	public Mage() {
		this(95,70,0,95);
	}

	public Mage(int healthStat, int attackStat, int gold, int maxHealth) {
		super(healthStat, attackStat, gold, maxHealth);
		
	}
	
	public void cattack1(Enemy enemy) {
		System.out.println("Mage used Fire Blast");
		if(Math.random()<0.92) {
			enemy.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack2(Enemy enemy) {
		System.out.println("Mage used Eletrocute");
		enemy.takeDamage((int)((getAttackStat())*0.9));
		System.out.println("It did " + (int)((getAttackStat())*0.9) + " damage");
	}
	
	public void cattack3(Enemy enemy) {
		System.out.println("Mage used Frostbolt");
		if(Math.random()<0.85) {
			enemy.takeDamage((int)((getAttackStat())*1.05));
			System.out.println("It did " + (int)((getAttackStat())*1.05) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void cattack4(Enemy enemy) {
		System.out.println("Mage used Mirror Attack");
		if(Math.random()<0.9) {
			enemy.takeDamage((int)(enemy.getAttackStat()*1.05));
			System.out.println("It did " + (int)(enemy.getAttackStat()*1.05) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}

}
