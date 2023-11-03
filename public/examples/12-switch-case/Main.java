import java.util.Scanner;

public class Main {
  public static void main(String[]args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Menu Option 1");
    System.out.println("Menu Option 2");
    System.out.println("Menu Option 3");

    System.out.println("Enter an option:");
    int choice = input.nextInt();
    
    switch (choice) {
      case 1:
	    System.out.println("ONE");
	    break;
	  case 2:
	    System.out.println("TWO");
	    break;
	  case 3:
	    System.out.println("THREE");
	    break;
	  default:
	    System.out.println("That is not a valid option!");
    }
    
  }
  
}
