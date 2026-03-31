package dailyAssignment;

public class PrimeNumber_27_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   {

		     int i, n = 13;
		     boolean isprime = true;

		     if (n < 2)
		       {
		          isprime = false;
		       }
		     else
		       {
		          for (i = 2; i < n; i++)
		           {
		            if (n % i == 0)
		             {
		              isprime = false;
		                  break;
		                }
		        }
		       }

		     String result = isprime ? "Prime" : "not Prime";
		     System.out.println ("The number " + n + " is : " + result);


		   }
	}
}

