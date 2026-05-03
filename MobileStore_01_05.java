package weekelyAssignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mobile {
    String brand;
    String model;
    double price;

    public Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + (int)price;
    }
}

public class MobileStore_01_05 {
    public static void main(String[] args) {
        ArrayList<Mobile> mobileList = new ArrayList<>();

        // 1. Add 5 mobile objects
        mobileList.add(new Mobile("Samsung", "S23", 70000));
        mobileList.add(new Mobile("Apple", "iPhone15", 80000));
        mobileList.add(new Mobile("OnePlus", "12", 60000));
        mobileList.add(new Mobile("Vivo", "V30", 35000));
        mobileList.add(new Mobile("Realme", "GT", 30000));

        // 2. Display all mobiles
        System.out.println("Original Mobiles:");
        display(mobileList);

        // 3. Sort mobiles based on price in descending order
        // (b2, b1) swap logic creates descending order
        Collections.sort(mobileList, (m1, m2) -> Double.compare(m2.price, m1.price));
        System.out.println("\nAfter Sorting Descending:");
        display(mobileList);

        // 4. Remove the most expensive mobile 
        // Since it's sorted descending, index 0 is the most expensive
        if (!mobileList.isEmpty()) {
            mobileList.remove(0);
        }
        System.out.println("\nAfter Removing Most Expensive Mobile:");
        display(mobileList);

        // 5. Search mobile by brand
        System.out.print("\n");
        for (Mobile m : mobileList) {
            if (m.brand.equalsIgnoreCase("Vivo")) {
                System.out.println("Brand Found: " + m.brand);
            }
        }

        // 6. Update price of one mobile (Samsung S23 to 68000)
        for (Mobile m : mobileList) {
            if (m.model.equals("S23")) {
                m.price = 68000;
            }
        }
        System.out.println("\nAfter Price Update:");
        display(mobileList);
    }

    public static void display(ArrayList<Mobile> list) {
        for (Mobile m : list) {
            System.out.println(m);
        }
    }
}
