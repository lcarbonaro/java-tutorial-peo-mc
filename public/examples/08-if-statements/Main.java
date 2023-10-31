import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age.");
		int age = input.nextInt();
		
		if( age < 13 ) {
		    
		    System.out.println("You are not a teen");
		    
		}
	}
}
