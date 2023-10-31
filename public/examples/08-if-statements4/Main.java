import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age.");
		int age = input.nextInt();
		
		if( age < 16 || age > 90 ) {
		    System.out.println("You should not be driving!!");
		} else {
		    System.out.println("Drive on!");
		}
		
	}
}
