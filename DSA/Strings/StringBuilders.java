package Strings;

public class StringBuilders {
    public static void main(String[] args) {

        // Declaration
        StringBuilder sb = new StringBuilder("Shubham");

        // Operations
        // sb.append('k');
        // sb.setCharAt(0, 'P');
        // System.out.println(sb.charAt(1));
        // sb.insert(0, 'S');
        // sb.delete(0, 4);
        // System.out.println(sb);

        StringBuilder str = new StringBuilder("hello");

        // System.out.println(str);

        // Reverse a string using Stringbuilder
        // for (int i = 0; i < sb.length() / 2; i++) {
        // int front = i; // i=0
        // int back = sb.length() - 1 - i; // back == 7-1-0 ==6

        // char frontChar = sb.charAt(front);
        // char backChar = sb.charAt(back);

        // sb.setCharAt(front, backChar);
        // sb.setCharAt(back, frontChar);
        // }

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char fromChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, fromChar);
        }

        System.out.println(str);

    }
}
