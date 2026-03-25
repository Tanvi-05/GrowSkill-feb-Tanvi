package assignment_24_03;

public class SubjectMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1=94, sub2=98, sub3=78,sub4=45,sub5=88;
		int total=0;
		double percentage;
		if(sub1<33 || sub2<33 || sub3<33 || sub4<33 ||sub5<33) {
			System.out.println("Student Result=Fail");
			System.out.println("Grade: F");
		}else
			 total = sub1 + sub2 + sub3 + sub4 + sub5;
              percentage = total / 5.0;
		{
			if (percentage >= 90) {
                System.out.println("Grade: A+");
            } else if (percentage >= 75) {
                System.out.println("Grade: A");
            } else if (percentage >= 60) {
                System.out.println("Grade: B");
            } else if (percentage >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
		}
		System.out.println("\nResult: Pass");
        System.out.println("Percentage: " + percentage + "%");

	}

}
