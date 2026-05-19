package weekelyAssignment1;

import java.util.Arrays;
import java.util.List;

public class ListUsingmethodReference_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list = Arrays.asList("A", "B", "C");
        
        list.forEach(System.out::println);
    }
	}


