package weekelyAssignment1;
@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}
public class ReverseString_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();
        
        String input = "engineer";
        String output = reverser.reverse(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    
	}

}
