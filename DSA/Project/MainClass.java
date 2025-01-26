package Project;

public class MainClass {

    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.setGrade("Shubham");
        e.setSalary(500000);

        System.out.println(e.getGrade() + " " + e.getSalary());
    }
}
