package dailyAssignment;

public class WhileLoop_25_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1;
		while(n<=50) {
			if(n%2==0 && n%5==0) {
				System.out.println(n*n);
			}else if(n%2==0) {
				System.out.println(n*n*n);
			}else if(n%5==0) {
				System.out.println(n*5);
			}else {
				System.out.println(n);
			}n++;
		}

	}

}

