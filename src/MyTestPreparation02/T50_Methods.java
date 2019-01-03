package MyTestPreparation02;

public class T50_Methods {
    void test(B50 x) { System.out.println("Its B50"); } //2

    void test(Object x) { System.out.println("Its Object"); } //3

    void test(C50 x) { System.out.println("Its C50"); } //4

    public static void main(String[] args){
        A50 a = new A50();
//        new T50_Methods().test(a);
    }
}

class A50 implements B50,C50{

}

interface B50 {

}

interface C50{

}
/*
What will happen
Its B50
Its C50

Its B50

Its C50

Its Object

The code will not compile

The code will not compile because of ambiguous thrower call.
*/
