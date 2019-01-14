package MyTestPreparation02;

public class T31_Methods {
    public static void main(String[] args) {
        A31 aTest = new A31();
    }
}

class A31{
    int a;
    static {
        int b = 20;
    }
    volatile int c;
    private int d;
}

/*
Which of the following variables are accessible from the class "test"?
a and d
a and c
b and c
None of the above

Only variables a and b are accessible. Variable b is defined in a static block and is not accessed from the outside. Variable d is private so it can't be accessed. The keyword volatile does not change accessibility of a variable.
*/
