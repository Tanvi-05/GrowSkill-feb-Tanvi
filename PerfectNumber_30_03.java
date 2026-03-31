package dailyAssignment;

public class PerfectNumber_30_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n = 6; 
		        int sum = 0;

		        for (int i = 1; i <= n / 2; i++) {
		            if (n % i == 0) {
		                sum += i;
		            }
		        }

		        if (sum == n && n != 0) {
		            System.out.println(n + " is a Perfect Number");
		        } else {
		            System.out.println(n + " is NOT a Perfect Number");
		        }
		    }
		

}
