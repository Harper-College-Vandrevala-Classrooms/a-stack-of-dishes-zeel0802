public class Main {
    public static void main(String[] args) {
        DishStack stack = new DishStack();

        // Adding dishes to the stack
        stack.push(new Dish(10));
        stack.push(new Dish(20));
        stack.push(new Dish(5));
        stack.push(new Dish(15));

        System.out.println("All Dishes in the Stack:");
        stack.printStack();

        // Search for a dish by size
        int searchSize = 5;
        int position = stack.searchDish(searchSize);
        if (position != -1) {
            System.out.println("\nDish with size " + searchSize + " found at position (from top): " + position);
        } else {
            System.out.println("\nDish with size " + searchSize + " not found in the stack.");
        }
    }
}
