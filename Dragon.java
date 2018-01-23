
public class Dragon extends Enemy{

	public Dragon() {
		this(500,65,false);
	}

	public Dragon(int healthStat, int attackStat, boolean defeated) {
		super(healthStat, attackStat, defeated);
		
	}
	
	public String toString() {
		return "This Dragon currently has " + getHealthStat() + " health and " + getAttackStat() + " attack";
	}
	
	public void attack1(Characters player) {
		System.out.println("Dragon used Flame Breathe");
		if(Math.random()<0.9) {
			if(player instanceof Knight) {
				player.takeDamage((int)((getAttackStat())*0.75));
				System.out.println("It did " + (int)((getAttackStat())*0.75) + " damage");
			}
			else {
				player.takeDamage((int)((getAttackStat())*1.05));
				System.out.println("It did " + (int)((getAttackStat())*1.05) + " damage");
			}
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void attack2(Characters player) {
		System.out.println("Dragon used Claw Strike");
		if(Math.random()<0.87) {
			player.takeDamage((int)((getAttackStat())*1.1));
			System.out.println("It did " + (int)((getAttackStat())*1.1) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void attack3(Characters player) {
		System.out.println("Dragon used Winged Attack");
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
	}
	
	public void attack4(Characters player) {
		System.out.println("Dragon used Roar");
		this.setAttackStat(this.getAttackStat()+15);
		System.out.println("It raised the dragon's attack by 15");
	}
}
