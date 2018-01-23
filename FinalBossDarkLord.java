
public class FinalBossDarkLord extends Enemy{

	public FinalBossDarkLord() {
		this(2000,150,false);
	}

	public FinalBossDarkLord(int healthStat, int attackStat, boolean defeated) {
		super(healthStat, attackStat, defeated);
	}
	
	public String toString() {
		return "The Dark Lord currently has " + getHealthStat() + " health and " + getAttackStat() + " attack";
	}
	
	public void attack1(Characters player) {
		System.out.println("The Dark Lord used Chaos Storm");
		player.takeDamage(getAttackStat());
		System.out.println("It did " + getAttackStat() + " damage");
	}
	
	public void attack2(Characters player) {
		System.out.println("The Dark Lord used Magic Drain");
			if(player instanceof Mage) {
				player.takeDamage((int)((getAttackStat())*1.3));
				System.out.println("It did " + (int)((getAttackStat())*1.3) + " damage");
			}
			else {
				player.takeDamage(getAttackStat());
				System.out.println("It did " + getAttackStat() + " damage");
			}
	}
	
	public void attack3(Characters player) {
		System.out.println("The Dark Lord used Pyromancy");
		if(player instanceof Mage) {
			player.takeDamage((int)((getAttackStat())*0.7));
			System.out.println("It did " + (int)((getAttackStat())*0.7) + " damage");
		}
		else {
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		
	}
	
	public void attack4(Characters player) {
		System.out.println("The Dark Lord used Anti-Matter Bomb");
		if(Math.random()<0.70) {
			player.takeDamage((int)((getAttackStat())*1.2));
			System.out.println("It did " + (int)((getAttackStat())*1.2) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
}
