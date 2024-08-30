public abstract class Item {
    private String title;

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return title.equals(item.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
