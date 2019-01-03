package MyTestPreparation02;

public class T31_Methods {
    int a;
    static {
        int b = 20;
    }
    volatile int c;
    private int d;

    public static void main(String[] args) {

    }
}

class A31{

    public static void main(String[] args) {
        T31_Methods test = new T31_Methods();
    }
}

/*
Which of the following variables are accessible from the class "test"?
a and d
a and c
b and c
None of the above

*/
