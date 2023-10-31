public class Main {
    
	public static void main(String[] args) {
	    
	    int[] numbers = new int[]{11,2,5,88,1,93,6};
        int limit = 3; // only show first 3 numbers in the list
        int counter = 0;        
	    
		// while loop
		while(counter < limit) {
		    System.out.println( numbers[counter] );
            counter++;  // crucial not to have an infinite loop
        }
		
	}
}
