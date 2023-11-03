public class Main {
    
    public static void main(String[]args) {

        int x = 20;
        int y = 4;

        int result1;
        int result2;

        // usual arithmetic 
        result1 = x + 5;
        System.out.println(x + " plus 5 is " + result1);
        result1 = x - 5;
        System.out.println(x + " minus 5 is " + result1);
        result1 = x * 5;
        System.out.println(x + " multiplied by 5 is " + result1);
        result1 = x / 5;
        System.out.println(x + " divided by 5 is " + result1);
        
        // modulus operator (remainder after division)
        result1 = x % 3;
        System.out.println(x + " mod 3 = " + result1);
        result1 = x % y;
        System.out.println(x + " mod " + y + " = " + result1);

        
        
        
        // note: x++ vs ++x
        // x++ shortcut for x = x + 1
        // post-increment: increments x AFTER returning value of x
        result1 = x++;
        System.out.println("x++ gives result: " + result1);
        System.out.println("but x is now " + x);

        // ++x also shortcut for x = x + 1
        // pre-increment: increments x BEFORE returning value of x
        result1 = ++x;
        System.out.println("++x gives result: " + result1);
        System.out.println("and x is now " + x);

        // similarly for -- (decrement)

        // x+=5 shortcut for x = x + 5
        result1 = x += 5;
        System.out.println("x+=5 gives result: " + result1);

        // x-=7 shortcut for x = x - 7
        result1 = x -= 7;
        System.out.println("x-=7 gives result: " + result1);

        // note order of operations BEDMAS
        result1 = x + y / 2;
        System.out.println(x + " + " + y + " / 2 = " + result1);

        result2 = (x + y) / 2;
        System.out.println("(" + x + " + " + y + ") / 2 = " + result2);

    }
}
