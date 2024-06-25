package Java_8;

public interface Developer {

    default void student() {
        System.out.println("My name is shubham");
    };

    static void teacher() {
        System.out.println("this is static method cannot be override....");
    };
}
