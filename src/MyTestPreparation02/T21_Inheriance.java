package MyTestPreparation02;



abstract class T21_Inheriance {
    public static void main(String[] args) {
        A21 a = new B21();
        a.name();
    }
}

class A21 {
    protected static void name(){
        System.out.println("A21");
    }
}

class B21 extends A21 {
    protected static void name(){
        System.out.println("B21");
    }
}

/*
What will we get if we run this code?
A
B
Compile time error.
A runtime error.
*/