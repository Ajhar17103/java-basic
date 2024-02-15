package Array.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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
        Iterator <Integer> it= arrylist.iterator();

        System.out.println(it.next());
        System.out.println(it.hasNext());
        while(it.hasNext()) {
            System.out.println(it.next());
        }


        int abc=10;
        Integer efg=20;

    }
}
