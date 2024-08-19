import java.util.Scanner;

public class StackScanAndPrint_int {
    public static void main (String[] args){

    Stack_int stack = new Stack_int(5);

    Scanner scn = new Scanner(System.in);

    for (int i=0; i< stack.maxSize; i++){
        System.out.println("Enter Element: " );
        int x = scn.nextInt();
        stack.push(x);
    }

    for (int i= 0; i < stack.maxSize; i++){
        System.out.println(stack.stackArray[i]);
    }


}


}