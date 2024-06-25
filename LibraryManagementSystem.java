import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LibraryManagementSystem {
    private final List<Book> books;
    private final Scanner scanner;

    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    //method to add book

    public void addBook() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        scanner.nextLine(); 
        Book book = new Book(title, author, isbn);
        books.add(book);
        System.out.println("Book added successfully.");
    }
     //method to remove book
    public void removeBook() {
        System.out.print("Enter ISBN to remove: ");
        String isbn = scanner.nextLine();
        try {
            Book bookToRemove = findBookByISBN(isbn);
            books.remove(bookToRemove);
            System.out.println("Book removed successfully.");
        } catch (ISBNNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    //method to remove book
    public void updateBook() {
        System.out.print("Enter ISBN to update: ");
        String isbn = scanner.nextLine();
        try {
            Book bookToUpdate = findBookByISBN(isbn);
            System.out.print("Enter new title: ");
            String newTitle = scanner.nextLine();
            System.out.print("Enter new author: ");
            String newAuthor = scanner.nextLine();
            scanner.nextLine();
            bookToUpdate.setTitle(newTitle);
            bookToUpdate.setAuthor(newAuthor);
            System.out.println("Book updated successfully.");
        } catch (ISBNNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
     //method  to check the book
    public void checkoutBook() {
        System.out.print("Enter ISBN to checkout: ");
        String isbn = scanner.nextLine();
        try {
            Book bookToCheckout = findBookByISBN(isbn);
            if (bookToCheckout.isAvailable()) {
                bookToCheckout.setAvailable(false);
                System.out.println("Book checked out successfully.");
            } else {
                System.out.println("Book is already checked out.");
            }
        } catch (ISBNNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    //method to return book
    public void returnBook() {
        System.out.print("Enter ISBN to return: ");
        String isbn = scanner.nextLine();
        try {
            Book bookToReturn = findBookByISBN(isbn);
            if (!bookToReturn.isAvailable()) {
                bookToReturn.setAvailable(true);
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not checked out.");
            }
        } catch (ISBNNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    //method to find book
    private Book findBookByISBN(String isbn) throws ISBNNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new ISBNNotFoundException("ISBN not found: " + isbn);
    }
    //display the book information

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void table() {
        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. Update book");
            System.out.println("4. Checkout book");
            System.out.println("5. Return book");
            System.out.println("6. Display books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> updateBook();
                case 4 -> checkoutBook();
                case 5 -> returnBook();
                case 6 -> displayBooks();
                case 7 -> {
                    System.out.println("Exiting the system.");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        library.table();
    }
}

