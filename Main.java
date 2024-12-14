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

        System.out.println("\nDish with Minimum Size: " + stack.getMinDish());

        stack.pop();
        System.out.println("\nDish with Minimum Size after one pop: " + stack.getMinDish());
    }
}
