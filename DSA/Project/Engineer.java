package Project;

public class Engineer extends Employee {

    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        // TODO Auto-generated method stub
        this.salary = salary;
    }

    @Override
    int getSalary() {
        // TODO Auto-generated method stub
        return salary;
    }

    @Override
    void setGrade(String grade) {
        // TODO Auto-generated method stub
        this.grade = grade;
    }

    @Override
    String getGrade() {
        // TODO Auto-generated method stub
        return grade;
    }

}
