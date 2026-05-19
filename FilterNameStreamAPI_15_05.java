package weekelyAssignment1;

import java.util.Arrays;
import java.util.List;

public class FilterNameStreamAPI_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names = Arrays.asList("Aman", "Riya", "Ankit", "Tushar");
        
        names.stream()
             .filter(name -> name.endsWith("a") || name.endsWith("A"))
             .forEach(System.out::println);
    }
	}


