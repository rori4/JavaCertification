package MyTestPreparation04;

public class T54_JavaBasics {
    static T54_Test a = new T54_Test("A");
    T54_Test b = new T54_Test("B");

    public static void main(String[] args) {
        T54_JavaBasics c = new T54_JavaBasics("C");
    }
    static {
        T54_JavaBasics d = new T54_JavaBasics("D");
    }
    T54_Test e = new T54_Test("E");

    public T54_JavaBasics(String a) {
        System.out.print(a +" ");
    }
}

class T54_Test {
    public T54_Test(String a) {
        System.out.print(a+" ");
    }
}

/*
What will be the result of running this code?
A B E D B E C <<
A B E D C
A D B E C
A B C D E

//TODO: Explain
*/
