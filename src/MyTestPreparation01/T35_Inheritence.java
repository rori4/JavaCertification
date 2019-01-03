package MyTestPreparation01;

public class T35_Inheritence extends AClass {
    public static void main(String[] args) {
        T35_Inheritence a = new T35_Inheritence();
        int b = a.value; //(1)
        int c = AClass.value; //(2)
        int d = value, //(3)
        e = a.value - 5 ; //(4)
    }
}

abstract class AClass {
    final static int  value = 0;
}

/*
It will have a compile error on point 1
It will have a compile error on point 2
It will have a compile error on point 3
It will have a compile error on point 4
I will compile with no problem.

*/