package weekelyAssignment1;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n = 60; 
		        int original=n;
		        System.out.print("Unique Prime Factors: ");
		        for (int i = 2; i <= original; i++) {
		  
		            if (i > original / 2 && i != n) {
		                break;
		            }

		            
		            if (n % i == 0) {
		                System.out.print(i + " ");
		                

		                while (n % i == 0) {
		                    n = n / i;
		                }
		            }
		        }
		    }
		

}
