package weekelyAssignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int n = 15; // Number of terms to attempt
		        int firstnum= 0;
		        int secondnum = 1;



		        for (int i = 1; i <= n; i++) {
		            // Check if the current term exceeds 100 before printing
		            if (firstnum> 100) {
		                break;
		            }

		            System.out.print(firstnum + " ");

		            // Compute the next term
		            int nextTerm = firstnum + secondnum;
		            firstnum = secondnum;
		            secondnum = nextTerm;
		        }
		    }
		
}
