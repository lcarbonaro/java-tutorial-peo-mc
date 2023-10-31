
public class Main {
    
  public static void main (String[]args) {

    // can declare as an empty array ...
    int[] numbers = new int[3];

    // and populate after
    numbers[0] = 100;
    numbers[1] = 401;
    numbers[2] = 42;

    System.out.println ("The " + numbers.length + " numbers are: " +
		  numbers[0] + ", " + numbers[1] + " and " +
		  numbers[2] + ".");

    // note: fixed size
    //numbers[3] = 13; // ERROR!! out-of-bounds

  }
  
}
