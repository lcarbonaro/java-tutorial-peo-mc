// 1. import the required Java libraries
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Main {
	public static void main(String[] args) {
		
		System.out.println("Input an int, a string, and a decimal, separated by spaces.");
		
		// 2. set up readers & tokenizer
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader(isr);
		StringTokenizer st = null;  
		
		// 3. read input line
		// note that must catch exception
		try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		// 4. tokenise (chop up) the input into respective variables
		// note parse methods for int, float
		int a = Integer.parseInt( st.nextToken() );
		String b = st.nextToken();
		float c = Float.parseFloat( st.nextToken() );
		
		// use input variables as needed
		System.out.println("input a is: " + a);
		System.out.println("input b is: " + b);
		System.out.println("input c is: " + c);
	}
}


