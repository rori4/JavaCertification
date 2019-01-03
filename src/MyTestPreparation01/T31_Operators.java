package MyTestPreparation01;

public class T31_Operators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        if (a = true | b != false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
/*
What will be the output of this code?

Compile time error

true

false

It will throw i

It will give a RuntimeException

*/