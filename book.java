class ISBNNotFoundException extends Exception {
    public ISBNNotFoundException(String message) {
        super(message);
    }
}
//creat book class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    //class constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    //read the title
    public String getTitle() {
        return title;
    }
    //write book title
    public void setTitle(String title) {
        this.title = title;
    }
    //read the auther
    public String getAuthor() {
        return author;
    }
    //write the book auther
    public void setAuthor(String author) {
        this.author = author;
    }
    //read the isbn 
    public String getIsbn() {
        return isbn;
    }
    //write the isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    //check book is available or not
    public boolean isAvailable() {
        return isAvailable;
    }
    //set book
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn +
               "isAvailable=" + isAvailable + "]";
    }
 
    
}
