package Inheritance;

public class Sub extends Super {
  private int officeId;
  private String joinDate;

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public int getOfficeId() {
        return officeId;
    }
    public String getJoinDate(){
        return joinDate;
    }


     public void printName(){
         System.out.println("This is call from Sub Class:" + " " + getName() + " " + getDesignation());

     }





}
