package weekelyAssignment1;


abstract class Payment {
 double amount;
 abstract void makePayment();

 void paymentDetails() {
     System.out.println("Payment Amount: " + amount);
 }
}


class CreditCardPayment extends Payment {
 String cardNumber;

 CreditCardPayment(double amount, String cardNumber) {
     this.amount = amount;
     this.cardNumber = cardNumber;
 }

 @Override
 void makePayment() {
     // Extracting last 4 digits for the message
     String lastFour = cardNumber.substring(cardNumber.length() - 4);
     System.out.println("Paid " + amount + " using Credit Card ending with " + lastFour);
 }
}

//3. Subclass for UPI
class UPIPayment extends Payment {
 String upiId;

 UPIPayment(double amount, String upiId) {
     this.amount = amount;
     this.upiId = upiId;
 }

 @Override
 void makePayment() {
     System.out.println("Paid " + amount + " using UPI ID: " + upiId);
 }
}

//Main
public class Payment_24_04 {
 public static void main(String[] args) {
     
     Payment p1 = new CreditCardPayment(5000, "1134567333331234");
     p1.paymentDetails();
     p1.makePayment();

     System.out.println(); 

     Payment p2 = new UPIPayment(1500, "user@upi");
     p2.paymentDetails();
     p2.makePayment();
 }
}