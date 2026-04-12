
package weekelyAssignment1;
class person {
	String name;
	int Age;
	
	person(String name, int Age) {
        this.name = name;
        this.Age = Age;
    }
}
class Student extends person{
	int marks;
	
	Student(String name,int Age, int marks){
		super(name, Age);
		this.marks=marks;
	}
	void display() {
       
        System.out.println("Name: " + name);
        System.out.println("Age: " + Age);
        System.out.println("Marks: " + marks);
    }
	
}

public class Inheritance_Student_10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Tanvi",34, 95 );
		s1.display();

	}

}
