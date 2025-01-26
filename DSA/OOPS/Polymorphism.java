package OOPS;

//Same name for different tasking/operation
public class Polymorphism {

    public static void print(String name) {
        System.out.println(name);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        print("Shubham");
    }
}
