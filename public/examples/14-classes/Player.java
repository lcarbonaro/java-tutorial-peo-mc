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
  
  // give a player some points
  public void awardPoints(int p) {
      score += p;
  }
  
}