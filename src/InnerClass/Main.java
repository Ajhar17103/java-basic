package InnerClass;

public class Main {
    public static void  main (String [] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner= myOuter.new InnerClass();

        System.out.println(myOuter.x+ myInner.y);
    }
}
