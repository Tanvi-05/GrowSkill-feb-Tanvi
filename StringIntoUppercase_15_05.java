package weekelyAssignment1;
@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}
public class StringIntoUppercase_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringTransformer toUppercase = str -> str.toUpperCase();
        
        String input = "hello java";
        String output = toUppercase.transform(input);
        
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    
	}

}



