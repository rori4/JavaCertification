package MyTestPreparation03;

public class T10_Inheritance {
    public static void main(String[] args) {
        B10 b = new C10("Java");
    }
}

class A10 {
    public A10() {
        System.out.println("A10 created");
    }

    public A10(String s) {
        System.out.println("A10 :" + s);
    }
}

class B10 extends A10 {
    public int B10() {
        System.out.println("B10 created");
        return 0;
    }

    public B10(String s) {
        System.out.println("B10: " + s);
    }
}

class C10 extends B10 {
    public C10() {
        super("Java");
    }

    public C10(String s) {
        this();
        System.out.println("C10: " + s);
    }
}

/*
What will we get if we run this code?
A10 created
B10: Java

A10 created
B10: Java
C10: Java

C10: Java

The code will not compile

To create any object one and only one constructor of that class and each of the super classes is called. (A12 constructor may as well delegate the construction to another constructor of the same class by calling this(...) as the first statement, just like calling a thrower.)

Because B has no defined constructor and so a default no-argument constructor will be called, which will call the no-argument constructor of A12

*/