package Example;

public class A01_TestClass{
    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException me){
            System.out.println(me);
        }
    }

    static void hello() throws MyException{
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException{
        throw new MyException("Exception from foo");
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

/*

A)
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
    at exceptions.TestClass.doTest(TestClass.java:24)
    at exceptions.TestClass.main(TestClass.java:14)
B)
Error in thread "main" java.lang.ArrayIndexOutOfBoundsException
C10)
Error in thread "main" java.lang.ArrayIndexOutOfBoundsException
D)
exceptions.MyException: Exception from foo
    at exceptions.TestClass.foo(TestClass.java:29)
    at exceptions.TestClass.hello(TestClass.java:25)
    at exceptions.TestClass.main(TestClass.java:14)


*/
