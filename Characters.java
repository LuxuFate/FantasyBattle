
public abstract class Characters {

	private int healthStat;
	private int attackStat;
	private int gold = 0;
	private int maxHealth;
	
	public Characters(int health, int attack, int gold, int maxHealth) {
		this.healthStat = health;
		this.attackStat = attack;
		this.gold = gold;
		this.maxHealth = healthStat;
	}
	
	public abstract void cattack1(Enemy enemy);
	public abstract void cattack2(Enemy enemy);
	public abstract void cattack3(Enemy enemy);
	public abstract void cattack4(Enemy enemy);

	public void takeDamage(int attackStat) {
		this.healthStat = healthStat - attackStat;
	}
	
	public void leveluphealth() {
		gold = gold - 75;
		maxHealth = healthStat + 50;
		System.out.println("You upgraded your health!");
		System.out.println("Now your Max Health is " + maxHealth + " health.");
		System.out.println("");
	}
	
	public void levelupattack() {
		gold = gold - 75;
		attackStat = attackStat + 20;
		System.out.println("You upgraded your attack!");
		System.out.println("Now your attack is " + attackStat + " attack.");
		System.out.println("");
	}
	
	public String toString() {
		return "Your character currently has " + healthStat + " health and " + attackStat + " attack";
	}
	public String toStringMoves(Characters player) { //Edit Moves
		if(player instanceof Assassin) {
			return "Blade Throw(1), Venom Dart(2), Shadow Strike(3), Mantis Slash(4)";
		}
		else if(player instanceof Knight) {
			return "Sword Slash(1), Sword Pierce(2), Shield Bash(3), Quick Cleave(4)";
		}
		else if(player instanceof Mage) {
			return "Fireblast(1), Eletrocute(2), Frostbolt(3), Mirror Attack(4)";
		}
		else {
			return "Rain of Arrows(1), Piercing Shot(2), Explosive Arrow(3), Bow Strike(4)";
		}
	}
	
	//Get and Set 
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

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
}
