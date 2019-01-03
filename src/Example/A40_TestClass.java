package Example;

class A40 {
}

class AA extends A40 {
}

public class A40_TestClass {
    public static void main(String[] args) throws Exception {
        A40 a = new A40();
        AA aa = new AA();
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());
    }
}
/*
It will not compile.
It will throw ClassCastException at runtime.

(correct)
a = class AA
aa = class AA

a = class A40
aa = class AA

getClass is a public instance thrower in Object class. That means it is polymorphic. In other words, this thrower is bound at run time and so it returns the name of the class of the actual object to which the reference points.
Here, at run time, both - a and aa, point to an object of class AA. So both will print AA.
*/