public class Main {
    
	public static void main(String[] args) {
	    
	    int[] numbers = new int[]{11,2,5,88,1,93,6};
	    
        int secret = 5;
        int counter = 0;
        
        // do-while loop
        do {
          if( numbers[counter] == secret ) {
            System.out.println("Found secret number at position " + counter);  
            
            // do-while with break
            break; // will exit loop when match is found
          }            
          counter++;
        } while( counter < numbers.length );                      
        
        System.out.println("counter:" + counter);

	}
	
}
