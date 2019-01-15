package MyTestPreparation03;
import java.io.IOException;

public class T28_Exception {
    public static void main(String[] args) throws Exception {
        try {
            try {
                m1();
            } finally {
                m2();
            }
        } catch (RuntimeException e) {
            System.out.println("caught");
        }
    }

    private static void m1() throws RuntimeException {
        System.out.print("1 ");
        throw new RuntimeException();
    }

    private static void m2() throws IOException {
        System.out.print("2 ");
        throw new IOException();
    }
}
/*
What will we get if we run this code?
1 caught

1 2 caught

1 2
Exception in thread "main" java.io.IOException

This code will not compile

Here although by calling m1() we throw a RuntimeException there is not catch block inside the inner try catch and this is why we are going to go to the finally block where we are going to call m2() and throw an IOException. Here as we are not in the try block and because IOException does not extend RuntimeException we are going to get "Exception in thread "main" java.io.IOException" printed.
*/