public class Main {
    
	public static void main(String[] args) {
	    
		// create an instance 
        Player player1 = new Player();
                
        // assign some instance attributes
        player1.name = "Tom";
        player1.score = 0;
            
        // call an instance method
        System.out.println( player1.getPlayerStatus() );    

        // player1 wins 10 points
        player1.score += 10;            
        System.out.println( player1.getPlayerStatus() );
            
        // player1 is given 5 bonus points
        player1.awardBonusPoints(5);            
        System.out.println( player1.getPlayerStatus() );                
              
	}
	
}
