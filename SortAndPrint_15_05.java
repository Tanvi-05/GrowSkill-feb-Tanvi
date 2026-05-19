package weekelyAssignment1;

import java.util.Arrays;
import java.util.List;

public class SortAndPrint_15_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list = Arrays.asList(40, 10, 30, 20);
        
        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}

