
public class Orc extends Enemy{

	public Orc() {
		this(150,35,false);
	}

	public Orc(int healthStat, int attackStat, boolean defeated) {
		super(healthStat, attackStat, defeated);
		
	}
	
	public String toString() {
		return "This Orc currently has " + getHealthStat() + " health and " + getAttackStat() + " attack";
	}
	
	public void attack1(Characters player) {
		System.out.println("Orc used Club Smash");
		if(Math.random()<0.9) {
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}

	public void attack2(Characters player) {
		System.out.println("Orc used Stomp");
		if(Math.random()<0.60) {
			player.takeDamage((int)((getAttackStat())*1.17));
			System.out.println("It did " + (int)((getAttackStat())*1.17) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}

	public void attack3(Characters player) {
		System.out.println("Orc used Rock Throw");
		if(Math.random()<0.86) {
			player.takeDamage((int)((getAttackStat())*1.1));
			System.out.println("It did " + (int)((getAttackStat())*1.1) + " damage");
		}
		else {
			System.out.println("It missed!");
		}

	}

	public void attack4(Characters player) {
		System.out.println("Orc used Brutal Wild Swing");
		if(Math.random()<0.30) {
			player.takeDamage((int)((getAttackStat())*1.5));
			System.out.println("It did " + (int)((getAttackStat())*1.5) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
}
