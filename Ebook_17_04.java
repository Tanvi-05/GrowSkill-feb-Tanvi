package weekelyAssignment1;

// Parent Class
class Book {
    String title;
    String author;
    
    // Question 3: Static variable
    static String libraryName = "City Library";
    
    // Question 4: Final variable
    final int ISBN = 12345;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Question 3: Static method
    static void showLibrary() {
        System.out.println("Library: " + libraryName);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    void getDescription() {
        System.out.println("This is a physical book.");
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    void display() {
        super.display();
        System.out.println("File Size: " + (int)fileSize + "MB");
    }

    @Override
    void getDescription() {
        System.out.println("This is an electronic book.");
    }
}

public class Ebook_17_04 {

    public static void main(String[] args) {
        // --- Question 1 & 2 ---
        EBook myBook = new EBook("Atomic Habits", "James Clear", 5);
        myBook.display();
        
        System.out.println("________________________________________");
        
        Book physical = new Book("General Title", "General Author");
        physical.getDescription();
        myBook.getDescription();

        System.out.println("________________________________________");

        // --- Question 3: Static Keyword ---
        Book.showLibrary();

        // --- Question 4: Final Keyword ---
        System.out.println("ISBN: " + physical.ISBN);
        // physical.ISBN = 999; // ERROR: cannot assign value to final variable

        System.out.println("________________________________________");

        // --- Question 5: String Methods ---
        String bookTitle = "Java Programming"; // Taking title as input
        
        System.out.println("Uppercase: " + bookTitle.toUpperCase());
        System.out.println("Length: " + bookTitle.length());
        System.out.println("Contains Java: " + bookTitle.contains("Java"));
    }
}