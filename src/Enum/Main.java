package Enum;

public class Main {
    public static void main(String [] args){
        Level levelObj= Level.MEDIUM;
        switch(levelObj) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("Low level");
                break;

        }
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

    }

}
