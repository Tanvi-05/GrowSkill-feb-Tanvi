package dailyAssignment;

public class Program_NumPyramid_01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(5);

	}
	static void printNumber(int n) {
		 for (int i = 1; i <= n; i++) {
	            
	            
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	           
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            
	            System.out.println();
		 }
    }
}