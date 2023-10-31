public class Main {
    
	public static void main(String[] args) {

        // instead of declaring separate variables ...
        /*
        String name1 = "Tom"; 
        String name2 = "Richard"; 
        String name3 = "Harriet"; 
        */
        
        // use an array 
        // one variable which holds 3 elements
        String[] names = new String[]{"Tom","Richard","Harriet"};
        
        // access using zero-based index
        System.out.println( "The first name on the list is " + names[0] +".");
        System.out.println( "And " + names[1] + " is next." );
        
        // can also use the index to change
        names[0] = "Thomas";
        System.out.println( "The first name is now " + names[0] +"." );

	}
}
