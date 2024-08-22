public class StackReverseString {
    public static String reverseString(String str){
        Stack_char strChar = new Stack_char(30);
        char[] charArray = str.toCharArray();
        for (char i : charArray){
            strChar.push(i);
        }
        System.out.println("\nReversed String :");
        for (int i = 0; i < str.length(); i++) {
            charArray [i] = strChar.pop();
        }
        return new String(charArray);
    }

    public static void main (String[] args){
       System.out.println( reverseString("Gamika"));

    }

}
