package MyTestPreparation02;

public class T17_Exceptions {
    public static void main(String[] args) {
        A17 a = new A17();
        try{
            a.a();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }
}

class A17 {
    public void a() {
        throw new ArithmeticException();
    }
}

/*
What will we get if we run this code?
It will not run because we need to add to the thrower throws RuntimeException
It will print "java.lang.ArithmeticException..."
It will print "java.lang.RuntimeException..."
It won't print anything.

*/