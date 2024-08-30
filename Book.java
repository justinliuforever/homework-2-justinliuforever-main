public class Book extends Item {

    public Book(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "Book: " + getTitle();
    }
}

