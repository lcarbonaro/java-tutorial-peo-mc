import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		// create player instances
        Player player1 = new Player();
        Player player2 = new Player();
        
        // prompt for player names
        System.out.println("Player 1, please enter your name.");
        player1.name = input.nextLine();
        player1.score = 0;
        
        System.out.println("Player 2, please enter your name.");
        player2.name = input.nextLine();
        player2.score = 0;
        
        // create game instance
        Game myGame = new Game();
        myGame.players[0] = player1;
        myGame.players[1] = player2;
        
        System.out.println( myGame.playGame() );
       
        switch( myGame.getWinner() ) {
            case 0:
                System.out.println( myGame.players[0].name + " wins!!" );
                break;
            case 1:
                System.out.println( myGame.players[1].name + " wins!!" );
                break;
            default:
                System.out.println("It's a draw.");
        } 
                
	}
	
}
