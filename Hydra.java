
public class Hydra extends Enemy{

	public Hydra() {
		this(700,100,false);
	}

	public Hydra(int healthStat, int attackStat, boolean defeated) {
		super(healthStat, attackStat, defeated);
		
	}
	
	public String toString() {
		return "This Hydra currently has " + getHealthStat() + " health and " + getAttackStat() + " attack";
	}
	
	public void attack1(Characters player) {
		System.out.println("Hydra used Flamethrower");
		if(Math.random()<0.9) {
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void attack2(Characters player) {
		System.out.println("Hydra used Omnidirectional Bite");
		if(Math.random()<0.95) {
			player.takeDamage(getAttackStat());
			System.out.println("It did " + getAttackStat() + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
	
	public void attack3(Characters player) {
		System.out.println("Hydra used Rejuvenation");
		int save = this.getHealthStat();
		if(this.getHealthStat()>0) {
			this.setHealthStat((int)(this.getHealthStat()*1.5));
			System.out.println("It healed " + (getHealthStat() - save) + " health");
			if(this.getHealthStat() > 700) {
				this.setHealthStat(700);
			}
		}
		else {
			System.out.println("The Hydra Died!");
		}
		
	}
	
	public void attack4(Characters player) {
		System.out.println("Hydra used Chaos Breath");
		if(Math.random()<0.65) {
			player.takeDamage((int)((getAttackStat())*1.35));
			System.out.println("It did " + (int)((getAttackStat())*1.35) + " damage");
		}
		else {
			System.out.println("It missed!");
		}
	}
}
