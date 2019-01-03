package MyTestPreparation04;

public class T10_Methods {

    static A10 newA(A10 a){
        a.a += 2;
        a = new A10();
        return a;
    }


    public static void main(String[] args){
        A10 a = new A10();
        a.a = 5;
        newA(a);
        a.a += 10;
        System.out.println(a.a);
    }
}

class A10 {
    int a = 6;
}

/*
What will be the result if you run this code?
15
16
17
The code will not compile.

*/

