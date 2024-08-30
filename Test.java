public class LibraryTest {
    public static void main(String[] args) {
        // Create a shelf
        Shelf shelf = new Shelf();

        // Create books and DVDs
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");
        DVD dvd1 = new DVD("The Matrix");
        DVD dvd2 = new DVD("Inception");

        // Add items to the shelf
        System.out.println("Adding items to the shelf:");
        shelf.addItem(book1);
        shelf.addItem(book2);
        shelf.addItem(dvd1);
        shelf.addItem(dvd2);

        // Attempt to add a duplicate item
        System.out.println("\nAttempting to add a duplicate item (The Great Gatsby):");
        boolean addedDuplicate = shelf.addItem(book1);
        System.out.println("Was the duplicate item added? " + addedDuplicate);

        // Display items on the shelf
        System.out.println("\nItems on the shelf:");
        shelf.displayItems();

        // Check if a specific item is on the shelf
        System.out.println("\nChecking if '1984' is on the shelf:");
        System.out.println("Is '1984' on the shelf? " + shelf.containsItem(book2));

        // Remove an item from the shelf
        System.out.println("\nRemoving '1984' from the shelf:");
        shelf.removeItem(book2);

        // Display items on the shelf after removal
        System.out.println("\nItems on the shelf after removal:");
        shelf.displayItems();

        // Get the count of items on the shelf
        System.out.println("\nTotal number of items on the shelf: " + shelf.getItemCount());
    }
}
