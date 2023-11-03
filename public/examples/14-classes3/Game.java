public class Game {
    
    Player[] players = new Player[2];
    
    
    public String playGame() {
        String gameResult;
        
        players[0].score += getRandom();
        players[1].score += getRandom();
        
        return players[0].getPlayerStatus() + "\n" + players[1].getPlayerStatus();
        
    }
    
    public int getWinner() {
        int winner;
        if( players[0].score > players[1].score ) {
            winner = 0;
        } else if( players[1].score > players[0].score ) {
            winner = 1;
        } else {
            winner = 3;
        }
        return winner;
    }
    
    private int getRandom() {
        int limit = 100; 
        double rnum = Math.random() * limit;
        return (int) (rnum + 1); // between 1 and 100
    }
}