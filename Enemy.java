
public abstract class Enemy {
	
	private int healthStat;
	private int attackStat;
	private boolean defeated;
	
	public Enemy(int health, int attack, boolean defeated) {
		this.healthStat = health;
		this.attackStat = attack;
		this.defeated = defeated;
	}
	
	public void takeDamage(int attack) {
		this.healthStat = healthStat - attack;
	}
	
	//public void 
	
	public abstract String toString();
	
	public abstract void attack1(Characters player);
	public abstract void attack2(Characters player);
	public abstract void attack3(Characters player);
	public abstract void attack4(Characters player);

	
	//Gets and Sets
	public int getHealthStat() {
		return healthStat;
	}

	public void setHealthStat(int healthStat) {
		this.healthStat = healthStat;
	}

	public int getAttackStat() {
		return attackStat;
	}

	public void setAttackStat(int attackStat) {
		this.attackStat = attackStat;
	}

	public boolean isDefeated() {
		return defeated;
	}

	public void setDefeated(boolean defeated) {
		this.defeated = defeated;
	}
}
