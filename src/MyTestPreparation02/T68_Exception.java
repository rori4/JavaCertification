package MyTestPreparation02;

public class T68_Exception {
    public static void main(String[] args) throws Exception {
        double[] a = {1/.0};
        double b = a[getNumber()];
        throw new IllegalArgumentException();
    }

    private static int getNumber() throws Exception {
        return 1;
    }
}

/*
What will we get if we run this code?
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
Exception in thread "main" java.lang.ArithmeticException: / by zero
Exception in thread "main" java.lang.IllegalArgumentException
The code will not compile
*/

