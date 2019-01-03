package MyTestPreparation02;

public class T35_Iheritance {
    public static void main(String[] args) {
        A35 a35 = new B35();
        System.out.println(((C35) a35).i);
    }
}
class A35{
    int i = 10;

}
class B35 extends A35{
    int i = 20;
}

class C35 extends B35{
    int i = 30;
}

/*
What will we get if we try to compile and run this code?
10
20
30
Exception in thread "main" java.lang.ClassCastException:


*/