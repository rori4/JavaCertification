package MyTestPreparation02;

public class T01_Inheritance {
    public static void main(String args[]) {
        A b = new B();
        B c = new C();
        System.out.println(b.message());
        System.out.println(c.message());
    }
}

class A {
    String message(){
        return "A";
    }
}

class B extends A {
    String message(){
        return super.message()+" B";
    }
}

class C extends B {
    String message(){
        return message() + " C10";
    }
}

/* What will we get if we run this code?
A B
Exception in thread "main" java.lang.StackOverflowError

A B
A B C10


B
C10

A B
A C10

This code will not compile


*/