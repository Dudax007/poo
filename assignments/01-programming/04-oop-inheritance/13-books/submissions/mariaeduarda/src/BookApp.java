public class BookApp {
    public static void main(String[] args) {
        Book genericBook = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald");
        System.out.println(genericBook);
        System.out.println();

        PrintBook printBook = new PrintBook(
            "Java: How to Program, Early Objects",
            2017,
            "Paul Deitel and Harvey Deitel",
            "Pearson",
            "978-0-13-474335-6"
        );
        System.out.println(printBook);
        System.out.println();

        AudioBook audioBook = new AudioBook(
            "To Kill a Mockingbird",
            1960,
            "Harper Lee",
            256.5,
            480,
            "Reese Witherspoon"
        );
        System.out.println(audioBook);
    }
}
public class BookApp {
    public static void main(String[] args) {
        Book genericBook = new Book("The Great Gatsby", 1925, "F. Scott Fitzgerald");
        System.out.println(genericBook);
        System.out.println();

        PrintBook printBook = new PrintBook(
            "Java: How to Program, Early Objects",
            2017,
            "Paul Deitel and Harvey Deitel",
            "Pearson",
            "978-0-13-474335-6"
        );
        System.out.println(printBook);
        System.out.println();

        AudioBook audioBook = new AudioBook(
            "To Kill a Mockingbird",
            1960,
            "Harper Lee",
            256.5,
            480,
            "Reese Witherspoon"
        );
        System.out.println(audioBook);
    }
}
