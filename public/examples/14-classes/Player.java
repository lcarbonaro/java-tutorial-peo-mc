public class Player {   
    
  // class attributes 
  String name;
  int score;
  
  // class methods 
  // do something to/with class attributes
  
  // display player status
  public String getPlayerStatus() {
      return "Player: " + name + " Score: " + score;
  }
  
  // give player some bonus points
  public void awardBonusPoints(int points) {
      score += points;
  }
  
}