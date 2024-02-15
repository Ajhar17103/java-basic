package Inheritance.Ex3;

public class Main {
    public static void  main (String [] args){
        HRManager hrObj = new HRManager();
        Employee empObj = new Employee();

        hrObj.setSalary(35000.75);
        empObj.setWork("189");

        System.out.println("Total work of hours: "+ empObj.getWork()+" " +"and, Total Salary: " + hrObj.getSalary());
    }
}
