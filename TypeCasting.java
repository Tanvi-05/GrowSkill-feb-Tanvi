package assignment2_20_03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks=97.8f;
		System.out.println("Float value: "+marks);
		
		double marks1= marks;
		System.out.println("Converted to double: "+marks1);
		
		int marks2= (int)marks;
		System.out.println("Converted to int: "+marks2);
		
		char digit=(char)marks2;
		System.out.println("Character value: "+digit);
		

	}

}
