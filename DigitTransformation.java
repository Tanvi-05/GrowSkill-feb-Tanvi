package weekelyAssignment1;

public class DigitTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        int n = 57243;
		        int original = n;
		        long newNumber = 0;
		        long placeValue = 1; 
		        int position = 1;    

		        while (n > 0) {
		            int digit = n % 10; 
		            int transformedDigit;

		            
		            if (position % 2 == 0) {
		                transformedDigit = 1;
		            } 
		            
		            else if (digit <= 4) {
		                transformedDigit = digit * 2;
		            } 
		            
		            else {
		                transformedDigit = digit;
		            }

		            
		            newNumber = (transformedDigit * placeValue) + newNumber;
		            
		            
		            if (transformedDigit >= 10) {
		                placeValue *= 100; 
		            } else {
		                placeValue *= 10;
		            }

		            n = n / 10; 
		            position++; 
		        }

		        System.out.println("Input: " + original);
		        System.out.println("Output: " + newNumber);
		    }
		

}
