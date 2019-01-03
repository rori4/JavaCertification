package MyTestPreparation03;

public class T14_Inheritance implements B14 {
    public static void main(String[] args) {
//        A14 acct = new B14();
//        System.out.println(acct.getName());
    }

    public String getName() {
        return null;
    }
}

interface A14 {
    public default String getName() {
        return "A";
    }
}

interface B14 extends A14 {
    public default String getName() {
        return "B";
    };
}

/*
It will not compile
null
A
B

The code will not compile because B14 is abstract and can not be instantiated
*/