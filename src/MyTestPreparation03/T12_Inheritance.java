package MyTestPreparation03;

public class T12_Inheritance {
    public static void main(String[] args) {
        get().speak();
    }

    public static A12 get(){
        return new C12();
    }
}

class A12 {
    public static void speak(){
        System.out.println("I am A12");
    }
}

class B12 extends A12 {
    public static void speak(){
        System.out.println("I am B12");
    }
}

class C12 extends B12 {
    public static void speak(){
        System.out.println("I am C12");
    }
}

/*
I am A12
I am B12
I am C12
The code will not compile

You cant override the inherited static methods, as in java overriding takes place by resolving the type of object at run-time and not compile time, and then calling the respective method.  This is why we are going to bet as a result "I am A" although that our get() method returns a C class.
*/