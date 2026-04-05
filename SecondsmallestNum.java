package weekelyAssignment1;

public class SecondsmallestNum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 1};
        
      
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }


        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
         
            if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest element found.");
        } else {
            System.out.println("Second Smallest Element: " + secondSmallest);
        }
    }
}