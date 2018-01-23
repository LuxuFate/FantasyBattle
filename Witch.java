
public class Witch extends Enemy {

	public Witch() {
		this(400,60,false);
	}

	public Witch(int healthStat, int attackStat, boolean defeated) {
		super(healthStat, attackStat, defeated);
		
	}
	
	public String toString() {
		return "This Witch currently has " + getHealthStat() + " health and " + getAttackStat() + " attack";
	}
	
	public void attack1(Characters player) {
		System.out.println("Witch used Self-Hex");
		this.setAttackStat(this.getAttackStat()+15);
		System.out.println("It raised the witch's attack by 15");
	}
	
	public void attack2(Characters player) {
		System.out.println("Witch used Magic Blast");
		if(Math.random()<0.90) {
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void attack3(Characters player) {
		System.out.println("Witch used Potion Throw");
		player.takeDamage(getAttackStat());
		System.out.println("It did " + getAttackStat() + " damage");
	}
	
	public void attack4(Characters player) {
		System.out.println("Witch used Summon Vampbats");
		player.takeDamage((int)((getAttackStat())*0.5));
		this.setHealthStat(this.getHealthStat()+50);
		System.out.println("It did " + (int)((getAttackStat())*0.5) + " damage and healed for 50 health");
	}
}
