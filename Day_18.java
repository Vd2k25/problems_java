public class SuA {
    int top;
    int maxSize;
    int stack[];

    // Constructor
    public SuA(int size) {
        top = -1;
        maxSize = size;
        stack = new int[maxSize];
    }

    // method to  Insert element
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push");
            return;
        }

        stack[++top] = value;
    }

    //  method to remove  top element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }

        return stack[top--];
    }

    // method to  view top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    //  method to preint stack 
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        SuA sa = new SuA(4);

        sa.push(40);
        sa.push(80);
        sa.push(90);
        sa.push(20);

        System.out.println("Popped: " + sa.pop());

        System.out.println("Top element: " + sa.peek());

        System.out.println("Stack elements:");
        sa.printStack();
    }
}
