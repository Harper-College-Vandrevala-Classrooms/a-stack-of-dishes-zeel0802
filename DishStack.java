import java.util.Stack;

public class DishStack {
    private Stack<Dish> mainStack;
    private Stack<Dish> minStack;

    public DishStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push a dish onto the stack
    public void push(Dish dish) {
        mainStack.push(dish);
        if (minStack.isEmpty() || dish.getSize() <= minStack.peek().getSize()) {
            minStack.push(dish);
        }
    }

    // Pop a dish from the stack
    public Dish pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        Dish poppedDish = mainStack.pop();
        if (poppedDish.equals(minStack.peek())) {
            minStack.pop();
        }
        return poppedDish;
    }

    // Get the dish with the minimum size
    public Dish getMinDish() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return minStack.peek();
    }

    // Print all dishes in the stack
    public void printStack() {
        for (Dish dish : mainStack) {
            System.out.println(dish);
        }
    }
}
