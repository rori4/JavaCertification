package MyTestPreparation02;

abstract class T12_Operators {
        int a;
        static String b;
        volatile Double d;
//        static abstract protected int e(){
//            return 1;
//        }
//        synchronized Integer f;
}

/*
Which lines of this code if any are not going to compile?
a
b
c
d
e
f
All of them will compile.

In this question synchronized is not allowed to be used in this way as defines. And the other line that will not compile is the one that we define a static abstract method. This is  because "abstract" means: "Implements no functionality", and "static" means: "There is functionality even if you don't have an object instance". And that's a logical contradiction. Volatile is a valid Java keyword and we can use it like this..
*/