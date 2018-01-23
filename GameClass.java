
public class GameClass {

	private int turn;
	private Characters player;
	private Enemy enemy;
	private boolean OrcD = false;
	private boolean WitchD = false;
	private boolean DragonD = false;
	private boolean HydraD = false;
	private boolean EndGame = false;

	public void start() {
		System.out.println("Choose a character to play as from the following");
		System.out.println("Knight(k), Mage(m), Archer(ar), and Assassin(as)");
		choosecharacter();
		System.out.println("Now you can choose who you want to fight!");
		System.out.println("The Orc is the weakest and the Hydra is the strongest");
		chooseenemy();
		System.out.println("Fight Started!");

		while(player.getHealthStat() > 0 || enemy.getHealthStat() > 0) {
			fight();
			//Enemy Dies
			if(enemy.getHealthStat() <= 0 && player.getHealthStat() > 0) {
				player.setHealthStat(player.getMaxHealth());
				loot();
				upgrade();
				if(OrcD && WitchD && DragonD && HydraD) {
					System.out.println("Now you have defeated all these enemies, You can fight the Final Boss!");
					System.out.println("Yes(y) or No(n)?");
					bossChoice();
					if(EndGame) {
						break;
					}
				}
				System.out.println("Who would you like to battle now?");
				chooseenemy();
				fight();
			}
			//Player Dies
			else if(player.getHealthStat() <= 0 && enemy.getHealthStat() > 0) {
				System.out.println("You died!");
				player.setHealthStat(player.getMaxHealth());
				player.setGold(player.getGold()-100);
				if(player.getGold() < 0) {
					player.setGold(0);
				}
				System.out.println("Oh no, You lost some gold!");
				System.out.println("Gold: " + player.getGold() + "");
				System.out.println("But don't worry, You were healed back to full health");
				System.out.println("");
				upgrade();
				if(OrcD && WitchD && DragonD && HydraD) {
					System.out.println("Now you have defeated all these enemies, You can fight the Final Boss!");
					System.out.println("Yes(y) or No(n)?");
					bossChoice();
					if(EndGame) {
						break;
					}
				}
				System.out.println("Who would you like to battle now?");
				chooseenemy();
				fight();
			}
			// Both Dies
			else if(enemy.getHealthStat() <= 0 && player.getHealthStat() <= 0) {
				System.out.println("You and the enemy both died! Try again!");
				player.setHealthStat(player.getMaxHealth());
				if(OrcD && WitchD && DragonD && HydraD) {
					System.out.println("Now you have defeated all these enemies, You can fight the Final Boss!");
					System.out.println("Yes(y) or No(n)?");
					bossChoice();
					if(EndGame) {
						break;
					}
				}
				System.out.println("Who would you like to battle now?");
				chooseenemy();
				fight();
			}
		}
	}

	public void fightBoss() {
		Enemy boss = new FinalBossDarkLord();
		System.out.println("Muhahaha, I am the Dark Lord, Now you have defeated my minions of Darkness.. You shall face me! >:)");
		System.out.println("The Dark Lord has 2000 health and 150 attack");
		System.out.println("");
		while(boss.getHealthStat() > 0 && player.getHealthStat() > 0) {
			System.out.println("Which attack would you like to use?");
			System.out.println(player.toStringMoves(player));
			String attackchoice = TextIO.getlnString();
			boolean attacked = false;
			while(attacked == false && (attackchoice != "1" || attackchoice != "2" || attackchoice != "3" || attackchoice != "4")){
				switch(attackchoice) {
				case "1":
					player.cattack1(boss);
					attacked = true;
					break;
				case "2":
					player.cattack2(boss);
					attacked = true;
					break;
				case "3":
					player.cattack3(boss);
					attacked = true;
					break;
				case "4":
					player.cattack4(boss);
					attacked = true;
					break;
				default:
					System.out.println("Please pick your attack from 1-4!");
					attackchoice = TextIO.getlnString();
					continue;
				}
				int bossattack = (int)(Math.random()*4);
				switch(bossattack) {
				case 0:
					boss.attack1(player);
					break;
				case 1:
					boss.attack2(player);
					break;
				case 2:
					boss.attack3(player);
					break;
				case 3:
					boss.attack4(player);
					break;
				}

				if(player.getHealthStat()<=0) {
					player.setHealthStat(0);
				}
				if(boss.getHealthStat()<=0) {
					boss.setHealthStat(0);
				}
				System.out.println(player.toString());
				System.out.println(boss.toString());
				System.out.println("");
			}
		}
		if(boss.getHealthStat() <= 0 && player.getHealthStat() > 0) {
			System.out.println("You beat the Dark Lord!");
			player.setHealthStat(player.getMaxHealth());
			System.out.println("You ended the game with " + player.getHealthStat() + " health and " + player.getAttackStat() + " attack");
			EndGame = true;
		}
		else if(player.getHealthStat() <= 0 && boss.getHealthStat() > 0) {
			System.out.println("You died! Please try again after becoming stronger");
			System.out.println("");
			player.setHealthStat(player.getMaxHealth());
		}
		else {
			System.out.println("You and the Dark Lord both died! Please try again!");
			System.out.println("");
			player.setHealthStat(player.getMaxHealth());
		}
	}

	public void bossChoice(){
		String bossChoice = TextIO.getlnString();
		boolean chose = false;
		while(chose == false && (bossChoice != "y" || bossChoice != "n")){
			switch(bossChoice) {
			case "y":
				fightBoss();
				chose = true;
				break;
			case "n":
				System.out.println("Okay, Maybe Later");
				chose = true;
				break;
			default:
				System.out.println("Enter y for yes or n for no!");
				bossChoice = TextIO.getlnString();
				continue;
			}
		}
	}


	public void upgrade() {
		while(player.getGold() >= 75) {
			player.setHealthStat(player.getMaxHealth());
			System.out.println("You have enough gold to upgrade!" + player.getGold() + " (Costs 75 Gold)");
			System.out.println("Do you want to upgrade your health(1) or attack(2)?");
			String upgradechoice = TextIO.getlnString();
			boolean lvup = false;
			while(lvup == false && (upgradechoice != "1" || upgradechoice != "2")){
				switch(upgradechoice) {
				case "1":
					player.leveluphealth();
					lvup = true;
					break;
				case "2":
					player.levelupattack();
					lvup = true;
					break;
				default:
					System.out.println("Please pick from 1 or 2!");
					upgradechoice = TextIO.getlnString();
					continue;
				}	
			}
		}
		System.out.println("Now you have " + player.getGold() + " gold left.");
	}

	public void loot() {
		if(enemy.getHealthStat() <= 0) {
			int gained; 
			if(enemy instanceof Orc) {
				gained = 75;
				OrcD = true;
			}
			else if(enemy instanceof Witch) {
				gained = 100;
				WitchD = true;
			}
			else if(enemy instanceof Dragon) {
				gained = 150;
				DragonD = true;
			}
			else if(enemy instanceof Hydra) {
				gained = 200;
				HydraD = true;
			}
			else {
				gained = 0;
			}
			player.setGold(player.getGold() + gained);
			System.out.println("You have gained " + gained + " gold!");
			System.out.println("Now you have " + player.getGold() + " gold.");
		}
	}

	public void fight() {
		System.out.println("Which attack would you like to use?");
		System.out.println(player.toStringMoves(player));
		String attackchoice = TextIO.getlnString();
		boolean attacked = false;
		while(attacked == false && (attackchoice != "1" || attackchoice != "2" || attackchoice != "3" || attackchoice != "4")){
			switch(attackchoice) {
			case "1":
				player.cattack1(enemy);
				attacked = true;
				break;
			case "2":
				player.cattack2(enemy);
				attacked = true;
				break;
			case "3":
				player.cattack3(enemy);
				attacked = true;
				break;
			case "4":
				player.cattack4(enemy);
				attacked = true;
				break;
			default:
				System.out.println("Please pick your attack from 1-4!");
				attackchoice = TextIO.getlnString();
				continue;
			}
		}
		int enemyattack = (int)(Math.random()*4);
		switch(enemyattack) {
		case 0:
			enemy.attack1(player);
			break;
		case 1:
			enemy.attack2(player);
			break;
		case 2:
			enemy.attack3(player);
			break;
		case 3:
			enemy.attack4(player);
			break;
		}

		if(player.getHealthStat()<=0) {
			player.setHealthStat(0);
		}

		if(enemy.getHealthStat()<=0) {
			enemy.setHealthStat(0);
		}
		System.out.println("");
		System.out.println(player.toString());
		System.out.println(enemy.toString());
		System.out.println("");
	}


	public void choosecharacter() {
		String playerchoice = TextIO.getlnString();
		while(player == null && (playerchoice != "k" || playerchoice != "m" || playerchoice != "ar" || playerchoice != "as")) {
			switch(playerchoice) {
			case "k":
				player = new Knight();
				System.out.println("A knight has 130 health and 40 attack");
				break;
			case "m":
				player = new Mage();
				System.out.println("A mage has 95 health and 70 attack");
				break;
			case "ar":
				player = new Archer();
				System.out.println("An archer has 110 health and 55 attack");
				break;
			case "as":
				player = new Assassin();
				System.out.println("An assassin has 100 health and 60 attack");
				break;
			default:
				System.out.println("Please enter a real character!");
				playerchoice = TextIO.getlnString();
				continue;
			}
		}
	}

	public void chooseenemy() {
		enemy = null;
		System.out.println("Dragon(d), Orc(o), Witch(w), and Hydra(h)");
		String enemychoice = TextIO.getlnString();
		while(enemy == null && (enemychoice != "w" || enemychoice != "o" || enemychoice != "d" || enemychoice != "h")) {
			switch(enemychoice) {
			case "w":
				enemy = new Witch();
				System.out.println("A witch has 400 health and 55 attack");
				break;
			case "o":
				enemy = new Orc();
				System.out.println("An orc has 150 health and 35 attack");
				break;
			case "d":
				enemy = new Dragon();
				System.out.println("A dragon has 500 health and 65 attack");
				break;
			case "h":
				enemy = new Hydra();
				System.out.println("A hydra has 700 health and 100 attack");
				break;
			default:
				System.out.println("Please enter a real enemy!"); 
				enemychoice = TextIO.getlnString();
				continue;
			}
		}
	}

	//Set and Get
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public Characters getPlayer() {
		return player;
	}

	public void setPlayer(Characters player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}
}
