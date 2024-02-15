package Array.HashMap;

import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {


        HashMap<String, Integer> hashArry = new HashMap<String, Integer>();

        hashArry.put("Azharul", 27);
        hashArry.put("saif", 26);

        System.out.println(hashArry);
         int abc=hashArry.get("Azharul");
        System.out.println(abc);
    }
}
