package weekelyAssignment1;


public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5};
        
        moveZerosToEnd(arr);
      
        System.out.print("Output: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        
        int nonZeroPos = 0;

        for (int i = 0; i < arr.length; i++) {
      
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos++;
            }
        }

        // Step 3: Fill the remaining positions with zeros
        while (nonZeroPos < arr.length) {
            arr[nonZeroPos] = 0;
            nonZeroPos++;
        }
    }
}