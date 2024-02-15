package Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] args){
        ArrayList<Integer> arrylist= new ArrayList<Integer>();
        arrylist.add(10);
        arrylist.add(5);
        arrylist.add(20);
        arrylist.add(25);
        arrylist.add(15);
        arrylist.add(35);
        arrylist.add(30);

        System.out.println("Before Sort: " + arrylist);
        Collections.sort(arrylist);
        System.out.println("After Sort: " + arrylist);
        System.out.println("array Size: " + arrylist.size());

        for (int i : arrylist) {
            System.out.println(i);
        }
        arrylist.remove(3);
        System.out.println(arrylist);
        arrylist.clear();
        System.out.println(arrylist);
    }
}
