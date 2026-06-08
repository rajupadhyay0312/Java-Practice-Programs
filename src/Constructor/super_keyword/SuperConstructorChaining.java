package Constructor.super_keyword;

class Author {
    String authorName;
    String authorEmail;
    long authorContact;
    String authorAddress;

    Author(String authorName, String authorEmail, long authorContact, String authorAddress) {
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.authorContact = authorContact;
        this.authorAddress = authorAddress;
    }

    public void displayAuthor() {
        System.out.println("\n******** AUTHOR INFO ********");
        System.out.println("Name : " + authorName);
        System.out.println("Email : " + authorEmail);
        System.out.println("Contact : " + authorContact);
        System.out.println("Address : " + authorAddress);
    }
}

class Book extends Author {
    String bookName;
    double price;
    final long ISBN;

    Book(String bookName, double price, long ISBN,
         String authorName, String authorEmail, long authorContact, String authorAddress) {

        super(authorName, authorEmail, authorContact, authorAddress);

        this.bookName = bookName;
        this.price = price;
        this.ISBN = ISBN;
    }

    public void displayBook() {
        System.out.println("\n******** BOOK INFO ********");
        System.out.println("Book Name : " + bookName);
        System.out.println("Price : " + price);
        System.out.println("ISBN : " + ISBN);
    }
}

class Library extends Book {
    String libraryName;
    String libraryAddress;
    String libraryEmail;
    long libraryContact;

    Library(String libraryName, String libraryAddress, String libraryEmail, long libraryContact,
            String bookName, double price, long ISBN,
            String authorName, String authorEmail, long authorContact, String authorAddress) {

        super(bookName, price, ISBN, authorName, authorEmail, authorContact, authorAddress);

        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryEmail = libraryEmail;
        this.libraryContact = libraryContact;
    }

    public void displayLibrary() {
        System.out.println("\n******** LIBRARY INFO ********");
        System.out.println("Name : " + libraryName);
        System.out.println("Address : " + libraryAddress);
        System.out.println("Email : " + libraryEmail);
        System.out.println("Contact : " + libraryContact);
    }
}

public class SuperConstructorChaining {
    public static void main(String[] args) {

        Library obj = new Library(
                "ABC Library", "Dattawadi", "abc@gmail.com", 9876543216L,
                "Present Book", 500, 6543217890L,
                "Spencer Johnson", "spencer@gmail.com", 1234567895L, "Mumbai"
        );

        obj.displayLibrary();
        obj.displayBook();
        obj.displayAuthor();
    }
}
