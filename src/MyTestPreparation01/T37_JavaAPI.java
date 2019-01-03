package MyTestPreparation01;

import java.util.ArrayList;
import java.util.List;

public class T37_JavaAPI {
    public static void main(String[] args) {
        List a = new ArrayList();
        a.add(1,"A");
        a.add(2,"B");
        a.add(4,"C10");
        System.out.println(String.join(", " ,a));
    }
}

/*
What will you get if you run this code?
A, B, , C10
A, B, C10
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
This code with not compile

*/