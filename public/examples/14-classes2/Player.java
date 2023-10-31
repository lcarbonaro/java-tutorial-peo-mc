public class Player {   
    
  // data attributes 
  String name;
  int score;
  
  // methods that do something on or with 
  // the data attributes
  
  // display player status
  public String getPlayerStatus() {
      return "Player: " + name + " Score: " + score;
  }
  
  // give a player some points
  public void awardPoints(int p) {
      score += p;
  }
  
}