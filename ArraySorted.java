package weekelyAssignment1;


public class ArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 2};

        System.out.println("Is arr1 sorted? " + isSorted(arr1)); // Output: true
        System.out.println("Is arr2 sorted? " + isSorted(arr2)); // Output: false
    }

    public static boolean isSorted(int[] arr) {
       
        for (int i = 0; i < arr.length - 1; i++) {
            
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        
        return true; 
    }
}