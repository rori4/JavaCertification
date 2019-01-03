package MyTestPreparation03;

abstract public class T59_Inheritance implements I59 {
    public String getValue() {
        return "B";
    }
}

interface I59 {
    default String getValue(){
        return "A";
    }
}

class B59 extends T59_Inheritance {
    public String getValue() {
        return "C";
    }
    public static void main(String[] args) {
//        I59 a = new T59_Inheritance();
//        B59 b = (B59) a;
//        System.out.println(b.getValue());
    }
}

/*
What will we get if we try to run this code?

The code will not compile <<
A
B
C
Exception in thread "main" java.lang.ClassCastException



The code will not as we are trying to instantiate an abstract class which is not possible.
I59 a = new T59_Inheritance();
*/