package Java.Section7;

public class BookDemo {

    public static void main(String[] args) {

        Book gameOfThrones = new Book("George Martin","Game Of Thrones","Fantasy",1243);
        Book chava = new Book("Shivaji Sawant","Chava","Biography",956);
        Book javaBook = new Book("Joel Murach","Java Programming","Coding",800);

        printBookDetails(gameOfThrones);
        printBookDetails(chava);
        printBookDetails(javaBook);

        gameOfThrones.printBookDetails();

    }

    public static void printBookDetails(Book book)
    {
        System.out.println("Tile:"+book.getTitle());
        System.out.println("Author:"+book.getAuthor());
        System.out.println("Genre:"+book.getGenre());
        System.out.println("Number of pages:"+book.getNumPages());
        System.out.println("------------------------------");

    }
}
