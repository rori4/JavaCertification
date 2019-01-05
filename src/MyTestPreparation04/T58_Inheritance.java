package MyTestPreparation04;

import java.util.ArrayList;

public class T58_Inheritance {
    public static void main(String[] args) {
        ArrayList<A58> list = new ArrayList<>();

        list.add(new SubClass58()); //1

        list.add(new Class58()); //2

        list.add(new A58() {}); //3

//        B58 a = new Class58();
//        list.add(a);           //4
    }
}

abstract class A58 {
}

interface B58 {
}

class Class58 extends A58 implements B58 {
}

class SubClass58 extends Class58 {
}

/*
Which of the following will cause a compile time error?
1
2
3
4
None of them. The code will run with no problems.


*/