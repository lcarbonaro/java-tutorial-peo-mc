import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter number to count up to?");
	    int maxLoop = input.nextInt();
	    
	    System.out.println(">>>>> ok counting up from 1 to " + maxLoop + " ...");
	    
        // for loop
        for(int i = 1; i <= maxLoop; i++) {
            System.out.println(i);              
        }
        
        System.out.println("<<<<< for-loop is done");
        
        /*
        note that for-loops can also count backwards
        use: for(int i = maxLoop; i >= 1; i--) ...
        */
        
	}
}
