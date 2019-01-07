package MyTestPreparation01;

public class T01_Exception {
    public static void main(String[] args) {
        throw new ArithmeticException();
//        try {
//            System.out.println(calcSub(5, 4));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    static int calcSub(int a, int b) throws NegativeNumberException {
        if ( a - b < 0) {
            throw new NegativeNumberException();
        } else {
            return b / (a - 5);
        }
    }


}

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("There result is negative");
    }
}
/*
What will be the output of the code?

There result is negative
-5
Exception in thread "main" java.lang.ArithmeticException: / by zero
MyTestPreparation01.NegativeNumberException: There result is negative
The code will not compile




*/
