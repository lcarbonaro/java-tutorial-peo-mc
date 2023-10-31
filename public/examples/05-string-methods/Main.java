import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    
        // prompt for some input	    
        Scanner input = new Scanner(System.in);
		System.out.println ("What is your name?");
        String name = input.nextLine();
        System.out.println ("What is your number?");
        String phone = input.nextLine();

        // .length()
        System.out.println("Hi " + name + ". Your name is " + name.length() +" letters long." );
    
        // .equals()
        System.out.println("Checking is your name Fred? " + name.equals("Fred") );
        
        // .charAt()
        System.out.println("Your initial is: " + name.charAt(0));
        
        // .substring()
        System.out.println("Your area code is " + phone.substring(0,3) );            
          
	}
}
