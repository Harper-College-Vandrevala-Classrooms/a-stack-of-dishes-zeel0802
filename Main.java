// Main.java
public class Main {
    public static void main(String[] args) {
        // Initialize stack with a maximum size of 4
        DishStack stack = new DishStack(4);

        // Create some dishes
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        // Test size when stack is empty
        System.out.println("Stack size: " + stack.size()); // Output: 0

        // Push dishes onto the stack
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        // Check size after pushes
        System.out.println("Stack size after pushes: " + stack.size()); // Output: 4

        // Peek at the top dish
        Dish peekedDish = stack.peek();
        if (peekedDish != null) {
            System.out.println("Top dish description (peek): " + peekedDish.description);
        }

        // Pop dishes from the stack
        Dish poppedDish = stack.pop();
        if (poppedDish != null) {
            System.out.println("Popped dish description: " + poppedDish.description);
        }

        Dish anotherPoppedDish = stack.pop();
        if (anotherPoppedDish != null) {
            System.out.println("Another popped dish description: " + anotherPoppedDish.description);
        }

        // Final size after pops
        System.out.println("Final stack size: " + stack.size()); // Output: 2
    }
}
