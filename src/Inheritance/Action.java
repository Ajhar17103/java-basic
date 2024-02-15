package Inheritance;

public class Action {

    public static void main(String[] args){
        Sub actionObj = new Sub();
        actionObj.setName("Azharul Islam");
        actionObj.setDesignation("Software Engineer");
        actionObj.setOfficeId(27);
        actionObj.setJoinDate("17-01-2023");
        actionObj.printName();
        System.out.println("User Info:"+" "+ actionObj.getName()+" "+actionObj.getDesignation()+" "+actionObj.getOfficeId()+" "+actionObj.getJoinDate());
    }
}
