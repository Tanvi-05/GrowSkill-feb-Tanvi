package weekelyAssignment1;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;

    // Constructor
    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }

    // toString method for Question 3 expected format
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + (int)salary +
                ", age=" + age +
                '}';
    }
}

public class StreamAssignment_23_05 {
    public static void main(String[] args) {
        
        // Sample Data
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Rahul", "IT", 75000, 25),
            new Employee(2, "Sneha", "HR", 50000, 30),
            new Employee(3, "Aman", "IT", 90000, 28),
            new Employee(4, "Priya", "Finance", 65000, 32),
            new Employee(5, "Karan", "HR", 45000, 24),
            new Employee(6, "Neha", "IT", 85000, 27)
        );

        // --- Question 1 ---
        System.out.println("--- Question 1 Output ---");
        employees.stream()
                .filter(e -> e.getSalary() > 70000)
                .map(Employee::getName)
                .forEach(System.out::println); // Fixed: Changed . to ::

        System.out.println(); 

        // --- Question 2 ---
        System.out.println("--- Question 2 Output ---");
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        departmentCount.forEach((dept, count) -> System.out.println(dept + " -> " + count));

        System.out.println(); 

        // --- Question 3 ---
        System.out.println("--- Question 3 Output ---");
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaidEmployee.ifPresent(System.out::println); // Fixed: Changed . to ::
    }
}