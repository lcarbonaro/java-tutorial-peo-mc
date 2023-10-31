import java.util.Scanner;  // import Scanner class

public class Main {
    
  public static void main(String[] args) {
    String name;
    int age;
    
    // declare a variable 'input' of type Scanner
    // assign it to keyboard (default input)
    Scanner input = new Scanner(System.in);
    
    // prompt user & save to variable
    // note nextLine() for String
    System.out.println("Please enter your name.");
    name = input.nextLine();
    
    // note nextInt() for int
    System.out.println("How old are you " + name + "?");
    age = input.nextInt();
    
    System.out.println("Name:" + name + " Age:" + age );
  }
  
}