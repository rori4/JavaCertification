package MyTestPreparation03;

public class T40_Exceptions {
    public static void main(String[] args) {
        Double a = 3.4;
        Double b = null;
        Double c = 0.0;
        new ArithmeticException();
        c += a;
        c += b;
        System.out.println(c);
    }
}

/*
What will we get if we run this code?
3.4
Exception in thread "main" java.lang.NullPointerException
Exception in thread "main" java.lang.ArithmeticException
The code will not compile because we have unreachable code.

The code will compile fine. Notice that we get create a new ArithmeticException(); but we do not throw it. This won't cause "Exception in thread "main" java.lang.ArithmeticException". However, we can not add null to number. This will cause a NullPointerException
*/
