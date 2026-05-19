package weekelyAssignment1;

import java.util.Arrays;
import java.util.List;

public class FilterStringNameStreamAPI_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list = Arrays.asList("Java", "Automation", "API", "Playwright");
        
        list.stream()
            .filter(str -> str.length() > 5)
            .forEach(System.out::println);
    
	}

}
