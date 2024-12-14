import java.util.Stack;

public class DishStack {
    private Stack<Dish> mainStack;

    public DishStack() {
        mainStack = new Stack<>();
    }

    // Push a dish onto the stack
    public void push(Dish dish) {
        mainStack.push(dish);
    }

    // Pop a dish from the stack
    public Dish pop() {
        if (mainStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return mainStack.pop();
    }

    // Search for a dish by size and return its position (from top of stack)
    public int searchDish(int size) {
        Stack<Dish> tempStack = new Stack<>();
        int position = -1; // -1 indicates not found
        int index = 0;

        // Search while keeping the original stack intact
        while (!mainStack.isEmpty()) {
            Dish currentDish = mainStack.pop();
            tempStack.push(currentDish);

            if (currentDish.getSize() == size) {
                position = index; // Found the dish
                break;
            }
            index++;
        }

        // Restore the original stack order
        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }

        return position; // Return -1 if not found, or the position from the top
    }

    // Print all dishes in the stack
    public void printStack() {
        for (Dish dish : mainStack) {
            System.out.println(dish);
        }
    }
}
