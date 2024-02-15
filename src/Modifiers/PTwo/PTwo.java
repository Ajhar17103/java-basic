package Modifiers.PTwo;

import Modifiers.POne.Main;

public class PTwo {
    public static void main(String[] args){
        Main poneObj= new Main();
        poneObj.setName("Azharul Islam");
        poneObj.setAge(27);

        System.out.println(poneObj.getAge()+" "+poneObj.getName());
    }

}
