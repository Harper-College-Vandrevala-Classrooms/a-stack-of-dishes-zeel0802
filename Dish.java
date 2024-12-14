public class Dish {
    private int size;

    public Dish(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dish [size=" + size + "]";
    }
}
