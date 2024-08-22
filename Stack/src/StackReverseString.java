public class StackReverseString {
    public static String reverseString(String str){
        Stack_char strChar = new Stack_char(30);
        char[] charArray = str.toCharArray();
        for (char i : charArray){
            strChar.push(i);
        }
        System.out.println("\nReversed String :");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(strChar.pop() + " ");
        }
        System.out.println(" \n");


        return str;
    }

    public static void main (String[] args){
        reverseString("Gamika");

    }

}
