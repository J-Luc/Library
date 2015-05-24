package lab1;

/**
 * A representation of a book.
 *
 * @author <a href="mailto:rkhatchadourian@citytech.cuny.edu">Raffi
 * Khatchadourian</a>.
 */
public class Book {

    /**
     * This book's title.
     */
    String title;
    boolean borrowed;
    boolean returned;
    boolean isBorrowed;
    //private String title;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        title = bookTitle;
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        borrowed = true;
        return;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        returned = false;
        return;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        if (returned == false) {
            System.out.println("In returned");
            return returned;
        }
        System.out.println("In last return");
        return true;
    }

    // Returns the title of the book

    public String getTitle() {
        // Implement this method
        return title;
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
