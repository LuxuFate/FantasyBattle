

public class GameRunner {
	
	public static void main(String[]args) {
		System.out.println("Welcome to the Fantasy Game");
		System.out.println("You are part of a quest to venture and fight monsters on this epic journey");
		System.out.println("It may not be the most balanced game :) ");
		System.out.println("You may need to grind weaker monster for gold in order to defeat the final boss");
		System.out.println("Hint: You should grind Hydra for Gold when you are strong enough");
		System.out.println("");
		GameClass game = new GameClass();
		game.start();
		System.out.println("Congratulations to our new hero!!!  :) ");
		System.out.println("");
		System.out.println("             ___________\n" + 
				"            '._==_==_=_.'\n" + 
				"            .-\\:      /-.\n" + 
				"           | (|:.     |) |\n" + 
				"            '-|:.     |-'\n" + 
				"              \\::.    /\n" + 
				"               '::. .'\n" + 
				"                 ) (\n" + 
				"               _.' '._\n" + 
				"              `\"\"\"\"\"\"\"`\n" + 
				"");
		
		
	}
	
	
}
