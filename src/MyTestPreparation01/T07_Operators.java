package MyTestPreparation01;

public class T07_Operators {
    public static void main(String[] args) {
        String command = "B";
        switch (command) {
            case"b":
                System.out.println("b");
            case "A":
                System.out.println("A");
                break;
            case "B":System.out.println("B");
            case "C10":System.out.println("C10");
            default:
                System.out.println("Other");
        }
    }

}
/*
B
Other

B

B
C10
Other

b





*/