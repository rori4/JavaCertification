package MyTestPreparation01;

public class T57_Exceptions {
    public static void main(String[] args) {
        try {
            double n = 230 / 0.0;
        } catch (RuntimeException r) {
            System.out.println("runtime");
        } /*catch (ArithmeticException e) {
            System.out.println("arithmetic");
        }*/
    }
}

/*
What will we get if we run this code?

runtime

arithmetic

A compile time error

runtime
arithmetic

*/