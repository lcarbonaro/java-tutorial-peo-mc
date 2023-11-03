public class Player {   
    
  // class attributes 
  String name;
  int score;
  
  // methods that do something on or with 
  // the class attributes
  
  // display player status
  public String getPlayerStatus() {
      return "Player: " + name + " Score: " + score;
  }
  
  // give player some bonus points
  public void awardBonusPoints(int points) {
      score += points;
  }
  
}