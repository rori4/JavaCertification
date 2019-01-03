package MyTestPreparation01;

public class T40_Inheritance {
    public static void main(String[] args) {
        //B40 b = new A40();
        B40 b = new B40(); // to not get an error above line should be in test
        A40 a = new A40();
        a = (A40) b;
        System.out.println(a);
        System.out.println(b);

    }
}

class A40{
    public String toString() {
        return "I am class A";
    }
}

class B40 extends A40 {
    public String toString() {
        return "I am class B";
    }
}

/*
What will you get if you run this code?
A compile time error

I am class A
I am class B

I am class A
I am class A

I am class B
I am class B

We will get a ClassCastException


*/