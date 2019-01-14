package MyTestPreparation02;

class A42 {
    public float calc(int a) {
        return a/4;
    }
}
public class T42_Inheritance extends A42{
    public float get(int a) {
        return  a*4.0f; //whithout f at end
    }

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

This code will not compile correctly because in the method "get" we are trying to return a double. If we multiply integer with double we are going to get a double. In order to fix this one ways it to put 'f' at the end of 4.0. The other ways it to cast everything to a float or parse it to float.
*/