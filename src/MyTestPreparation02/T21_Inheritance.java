package MyTestPreparation02;

abstract class T21_Inheritance {
    public static void main(String[] args) {
        A21 a = new B21();
        a.name();
        // Static member accessed via instance reference
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

Although here we have an instance of B the code will print A. This is because our classes are both static. Static members belong to the class, not to a particular instance. This is the reason behind why why get "B" and not "A" as a result. If the both methods name were not static the resulted output would have been "B".
*/