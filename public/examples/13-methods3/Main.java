public class Main {

    public static void main(String[] args) {
    
        // sayHello();
        // sayAnything("Hello there");
        // sayAnything("Java functions are great!");
        
        sayAnythingAgain("is there an echo in here?", 3);

    } // end of main() method
    
    public static void sayAnythingAgain(String msg, int times) {
        for(int i = 1; i <= times; i++) {
            System.out.println(msg);
        }    
    }
    
    public static void sayHello() {
        System.out.println("My function says hello!!");
    }
    
    public static void sayAnything(String msg) {
        System.out.println(msg);
    }
 
}  