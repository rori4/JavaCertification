package MyTestPreparation02;

class A42 {
    public float calc(int a) {
        return a/4;
    }
}
public class T42_Inheritance extends A42{
//    public float get(int a) {
//        return a*4.0;
//    }

    public static void main(String[] args) {
        T42_Inheritance test = new T42_Inheritance();
        System.out.println(test.calc(8));
    }
}
/*
What will happen if we try to run this code?
It will print 32.0
It will print 2.0
It will print 2
The code will not compile


*/