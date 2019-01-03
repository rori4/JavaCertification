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

}

/*
Which of the following is/are if any a validly declared constructor
(multiple choice)
a
b
c
d
None of them

*/