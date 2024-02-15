package Modifiers.POne;

public class UserInfo {
    public static void main(String[] args) {
        Main userObj = new Main();

        userObj.setName("Md. Azharul Islam");
        userObj.setAge(27);

        System.out.println( "User Name: "+userObj.getName()+" " +"Age is:"+userObj.getAge());
//        return ("User Name: "+userObj.getName()+" " +"Age is:"+userObj.getAge());
    }
}
