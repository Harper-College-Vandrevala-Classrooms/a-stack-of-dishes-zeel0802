// DishStack.java
public class DishStack {
    private Dish[] stack;
    private int maxSize;
    private int top;

    // Constructor to initialize the stack with a maximum size
    public DishStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new Dish[maxSize];
        top = -1; // Indicates that the stack is empty
    }

    // Push a dish onto the stack
    public void push(Dish dish) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push new dish.");
            return;
        }
        stack[++top] = dish;
    }

    // Pop a dish off the stack
    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    // Peek at the top dish without removing it
    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return stack[top];
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }
}
