package MyTestPreparation01;

public class T27_DataTypes {
    public static void main(String[] args) {
        String question = "STR-.99";
        int answer = (int) Double.parseDouble(question.substring(3));
//        System.out.println((int) 0.51);
//        System.out.println((int) 1.51);
//        System.out.println((int) 1.99);
//        System.out.println((int) -0.51);
//        System.out.println((int) -1.51);
        switch (Math.abs(answer)) {
            case 0:
                System.out.print("Java ");
            case 1:
                System.out.print("Programming ");
                break;
            default:
                System.out.print("Secrets");
        }
    }
}
/*
What will the program print?

Java Programming Secrets

Java

Programming Secrets

Java Programming

This code will throw an exception

when < 0 casting to int will round up and when > 0 we will round down
*/