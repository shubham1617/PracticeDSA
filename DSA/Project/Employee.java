package Project;

public abstract class Employee {
    private int salary;
    private int grade;

    abstract void setSalary(int salary);

    abstract int getSalary();

    abstract void setGrade(String grade);

    abstract String getGrade();

    public void label() {
        System.out.println("Employee's Data" + grade + salary);
    }

}
