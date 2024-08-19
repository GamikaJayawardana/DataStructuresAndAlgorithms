public class Stack_int {
    int top;
    int maxSize;
    int[] stackArray;

    public Stack_int(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }

    public boolean isStackFull() {
        return (top == maxSize - 1);
    }

    public void push(int x) {
        if (isStackFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        top++;
        stackArray[top]=x;
        System.out.println("inserting "+x);

    }

    public int pop() {
        if (isStackEmpty()) {
            System.out.println("stack is Empty");
            System.exit(1);
        }
        return stackArray[top--];

    }

}