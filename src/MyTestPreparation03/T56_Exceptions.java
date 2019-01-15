package MyTestPreparation03;

public class T56_Exceptions {
    public static void main(String[] args) {
        try {
            int i = 8 / 0;
        } catch (RuntimeException e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
//        } catch (ArithmeticException e) {
//            System.out.println("Arithmetic");
        } finally {
            System.out.println("Finally");
        }
    }
}

/*
What will happen if we try to run this code?
The code will not compile

Exception
Throwable
Arithmetic
Finally

Arithmetic
Finally

Exception
Finally

Throwable
Finally


The code will not compile because ArithmeticException has already been caught by RuntimeException.
*/