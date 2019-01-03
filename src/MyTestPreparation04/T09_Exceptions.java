package MyTestPreparation04;

public class T09_Exceptions {
    private static String message = null;
    private static String secret = null;

    public T09_Exceptions(String message) {
        T09_Exceptions.message = message;
    }

    static {
        secret = message.substring(4, 10);
    }

    public String decode() {
        return secret;
    }

    public static void main(String[] args) {
        T09_Exceptions a = new T09_Exceptions("$32$SECRET*&3**");
        System.out.println(a.decode());
    }
}
/*
What will be the result of running this code?

SECRET

Exception in thread "main" java.lang.NullPointerException

java.lang.ExceptionInInitializerError     <<<<<<<<<<<<<
Caused by: java.lang.NullPointerException

The code will not compile

You know that when we instantiate a new class the static blocks get executed first. So in this case when we try to create the class for variable a,
the "secret = message.substring(4, 10);" gets executed first before the constructor. And since by default we have "secret = null" we will get an NullPointerException.
However this gets wrapped in ExceptionInInitializerError caused by NullPointerException. An ExceptionInInitializerError is thrown to indicate that an exception occurred during evaluation of
a static initializer or the initializer for a static variable.
*/

