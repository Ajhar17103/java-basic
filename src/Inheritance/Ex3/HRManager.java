package Inheritance.Ex3;

public class HRManager extends Employee {
    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public String getWork() {
        return super.getWork();
    }

    public void addEmployee(){
        System.out.println("Add New Employee");
    }
}
