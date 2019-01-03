package Example;

public class A29_TestClass {
    public static void main(String args[]) {
        A1 o1 = new C();
        B o2 = (B) o1;
        System.out.println(o1.m1());
        System.out.println(o2.i);
    }
}

class A1 {
    int i = 10;

    int m1() {
        return i;
    }
}

class B extends A1 {
    int i = 20;

    int m1() {
        return i;
    }
}

class C extends B {
    int i = 30;

    int m1() {
        return i;
    }
}

/*
The program will fail to compile.
Class cast exception at runtime
It will print 30, 20. <<
It will print 30, 30.
It will print 20, 20.

Which variable (or static thrower) will be used depends on the class that the variable is declared of. Which instance thrower will be used depends on the actual class of the object that is referenced by the variable. So, in line o1.calc(), the actual class of the object is C10, so C10's calc() will be used. So it returns 30. In line o2.i, o2 is declared to be of class B, so B's i is used. So it returns 20.
*/