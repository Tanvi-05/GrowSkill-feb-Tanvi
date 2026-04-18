package weekelyAssignment1;

class Vehicle {
    String brand;
    int speed;
    
    // Question 3: Static variable
    static String company = "AutoWorld Ltd";

    // Question 1: Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Question 2: Method to be overridden
    void run() {
        System.out.println("Vehicle is running");
    }

    // Question 3: Static method
    static void displayCompany() {
        System.out.println("Company: " + company);
    }

    // Question 4: Final method
    final void engineType() {
        System.out.println("Engine type: Standard Engine");
    }
}

class Car extends Vehicle {
    String fuelType;

    // Question 1: Constructor using super
    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    // Question 1: Display method for output
    void displayCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }

    // Question 2: Overriding run method
    @Override
    void run() {
        System.out.println("Car is running smoothly");
    }

    // Question 4: Attempting to override final method (Will cause Error)
    /* void engineType() { 
        System.out.println("Attempting to override..."); 
    } 
    */
}

public class VehiclesProgram_17_04 {
    public static void main(String[] args) {
        // --- Question 1 & 2 ---
        Car myCar = new Car("Hyundai", 120, "Petrol");
        myCar.displayCarDetails();
        
        System.out.println("________________________________________");
        
        Vehicle myVehicle = new Vehicle("Generic", 60);
        myVehicle.run();
        myCar.run();

        System.out.println("________________________________________");

        // --- Question 3: Static Keyword ---
        Vehicle.displayCompany();

        // --- Question 4: Final Keyword ---
        myCar.engineType();
        // Note: Overriding engineType() in Car class would result in: 
        // "Error: cannot override final method"

        System.out.println("________________________________________");

        // --- Question 5: String Methods ---
        String brandName = "Hyundai";
        
        // Reverse String
        StringBuilder sb = new StringBuilder(brandName);
        System.out.println("Reversed: " + sb.reverse());
        
        // Replace Characters (Replacing 'u', 'a', 'i' with '*')
        String replaced = brandName.replace('y', '*').replace('a', '*').replace('i', '*');
        // Simple version to match sample:
        System.out.println("Replaced: " + brandName.replace('u', '*').replace('a', '*').replace('i', '*'));
        
        // Check Equality
        System.out.println("Equals Hyundai: " + brandName.equalsIgnoreCase("Hyundai"));
    }
}