public class StackReverseWord {
    int top;
    int maxSize;
    char[] stackArray;

    public StackReverseWord(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }

    public boolean isStackFull() {
        return (top == maxSize - 1);
    }

    public void push(char x) {
        if (isStackFull()){
            System.out.println("Stack is full");
            System.exit(1);
        }
        top++;
        stackArray[top]=x;
        System.out.println("inserting "+x);

    }

    public char pop() {
        if (isStackEmpty()) {
            System.out.println("stack is Empty");
            System.exit(1);
        }
        return stackArray[top--];

    }
}
