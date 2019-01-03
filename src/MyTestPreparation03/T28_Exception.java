package MyTestPreparation03;
import java.io.IOException;

public class T28_Exception {
    public static void main(String[] args) throws Exception {
        try {
            try {
                m2();
            } finally {
                m3();
            }
        } catch (RuntimeException e) {
            System.out.println("caught");
        }
    }

    private static void m2() throws RuntimeException {
        System.out.print("1 ");
        throw new RuntimeException();
    }

    private static void m3() throws IOException {
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

*/