public class DVD extends Item {

    public DVD(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "DVD: " + getTitle();
    }
}
