public class PrintBook extends Book {
    private String publisher;
    private String isbn;

    public PrintBook(String title, int year, String author, String publisher, String isbn) {
        super(title, year, author);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Publisher: %s | ISBN: %s", publisher, isbn);
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }
}
