package OOPS;

class Shape {

    public void area() {
        System.out.println("Printing area");
    }

}

class Rectangle extends Shape {
    public int area(int len, int breadth) {
        return len * breadth;
    }
}

class Square extends Shape {
    public double area(int a) {
        return Math.pow(a, 2);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s.area(3));
    }

}
