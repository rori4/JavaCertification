package MyTestPreparation03;

public class T57_Inheritance {
    public static void main(String[] args) {
        A[] a = new A[0];
        B b = new C();
//        C c = new ICustom();
        ICustom c = new C();
        ICustom d = c;
//        ICustom e = a;
    }
}

interface ICustom {};
class A {};
class B extends A implements ICustom {};
class C extends B{};

/*
Which will be the FIRST line if any that will cause the compilation error
a
b
c
d
e
f
The code will compile correctly.



*/