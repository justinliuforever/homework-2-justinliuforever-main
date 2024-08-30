import java.util.LinkedHashSet;
import java.util.Set;

public class Shelf {
    private Set<Item> items;

    public Shelf() {
        this.items = new LinkedHashSet<>();
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int getItemCount() {
        return items.size();
    }

    public boolean containsItem(Item item) {
        return items.contains(item);
    }
}
