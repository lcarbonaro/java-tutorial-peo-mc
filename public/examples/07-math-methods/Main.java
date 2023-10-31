public class Main {
	public static void main(String[] args) {
	    
	    // power
        int y = 4;
        System.out.println( Math.pow(y,2) );
              
        double rnum;
        int limit;

        // generate a random number
        rnum = Math.random();
        System.out.println( rnum ); // between 0 and (less than) 1 

        // random between 0 and limit
        limit = 6; 
        rnum = Math.random() * limit;
        System.out.println( rnum ); // between 0 and (less than) 6

	}
}
