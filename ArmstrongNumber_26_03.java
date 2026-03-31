package dailyAssignment;

public class ArmstrongNumber_26_03 {

	public static void main(String[] args) {
		int number = 123, originalNumber, rem, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            rem = originalNumber % 10;
            result = result +(rem*rem*rem);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    
	}

}
