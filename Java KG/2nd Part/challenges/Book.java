package challenges;

class Book {
    static int totalnumberofBooks;

    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static{
        totalnumberofBooks = 0;
    }
{
    totalnumberofBooks++;
}//this is an instance initializer block, which is executed before the constructor is called, and it increments the total number of books every time a new book object is created.
Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalnumberofBooks++;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }


static int getTotalnumberofBooks() {
        return totalnumberofBooks;
    }
 void borrowBook() {
        if (isBorrowed) {
            System.out.println("Sorry, this book is already borrowed.");
        } else {
           this.isBorrowed = true;
            System.out.println("You have borrowed: " + title);
        }
    }

    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book was not borrowed.");
        }
    }

}