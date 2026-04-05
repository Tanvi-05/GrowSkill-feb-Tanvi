package dailyAssignment;


public class Program_Area_02_04 {

   
    public double Circlearea(double radius) {
        return Math.PI * radius * radius;
    }
    public int Rectarea(int length, int breadth) {
        return length * breadth;
    }
    public int Squrarea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
    	Program_Area_02_04 calc = new Program_Area_02_04();

  
        System.out.println("Area of Circle: " + calc.Circlearea(5.0));

      
        System.out.println("Area of Rectangle: " + calc.Rectarea(4, 6));

       
        System.out.println("Area of Square: " + calc.Squrarea(4));
    }
}