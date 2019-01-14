package MyTestPreparation02;

public class T61_Constructors {
    int a;
    double b;
    String c;

    private T61_Constructors() { //<<
    }

    T61_Constructors(int a) { // <<
        this.a = a;
    }

    public void T61_Constructors(double b) {
        this.b = b;
    }

//    const T61_Constructors(String c) {
//        this.c = c;
//    }

    public static void main(String[] args) {
        T61_Constructors a = new T61_Constructors(1);
    }
}

/*
Which of the following is/are if any a validly declared constructor
(multiple choice)
a
b
c
d
None of them

The only valid constructors defined here are "Test()" and "Test(int a)". The "const" keyword is reserved but not used in Java and will cause a compilation error. "public void Test(double b)" is  not a valid constructor but a method.
*/