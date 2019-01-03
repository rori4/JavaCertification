package MyTestPreparation04;


public class T17_Inheritance extends B17{

    public static void main(String[] args) {
        A17 a = new T17_Inheritance();
        a.m1();
    }

    @Override
    public void m1() {
        System.out.println("C");
    }
}

abstract class B17 implements A17 {
    public abstract void m1();

    public B17() {
        System.out.println("B");
    }
}



interface A17 {
    default void m1(){
        System.out.println("A");
    }
}
/*
What will be the output if we run this code?
A

B

B
A

B
C



BC is the right.(EXPLAIN)
*/