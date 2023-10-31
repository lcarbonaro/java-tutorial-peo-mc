public class Main {
    
	public static void main(String[] args) {
	    
	    int[] numbers = new int[]{11,2,5,88,1,93,6};
	    
	    // for-each loop with continue
        for(int n : numbers ) { // skip even numbers
            
            if(n % 2 == 0) {
                continue;  // skips iteration
            }
        
            System.out.println(n);
            
        }

	}
	
}