package Strings;

public class StringBuilders {
    public static void main(String[] args) {

        // Declaration
        StringBuilder sb = new StringBuilder("Shubham");

        // Operations
        // setCharAt(index,char) -- set at the index
        // sb.setCharAt(2, 'p');

        // inset
        // sb.insert(2, 'Z');

        // Delete
        // sb.delete(2, 3);

        // Append
        // sb.append(" Kumar");

        System.out.println(sb);

        // Reverse a string using Stringbuilder
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i; // i=0
            int back = sb.length() - 1 - i; // back == 7-1-0 ==6

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);

    }
}
