package weekelyAssignment1;


	
	class Employee{
		int id;
		String name;
		double basicSalary;
	
	Employee(int id, String name, double basicSalary){
		this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
		
		
	}
	
	double calculatesalary() {
		double hra=basicSalary*0.20;
		double bonus=basicSalary*0.10;
		return basicSalary+hra+bonus;
	}
	void display() {
        
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Total Salary : " + calculatesalary());
        
    }
	}
	public class Inheritance_Employee_10_04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee(1, "Tanvi",60000);
		emp.display();

	}

	}
