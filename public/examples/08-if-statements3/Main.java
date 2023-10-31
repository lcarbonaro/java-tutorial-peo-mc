import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age.");
		int age = input.nextInt();
		
		if( age >= 13 && age <= 19 ) {
		    
		    System.out.println("You are a teen");
		    
		} else {
		    System.out.println("You are NOT a teen");
		}
	}
}
