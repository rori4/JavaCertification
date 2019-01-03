package MyTestPreparation04;

import java.util.*;

public class T03_JavaAPI {
    public static void main(String[] args) {
        List<Object> a = new ArrayList<Object>();
        a.add("String");
        a.add(a);
        a.add(new Object());
        List<Object> b = (List<Object>) a.get(a.size()-2);
        System.out.println(b.get(1));
    }
}

/*
What will we get as output if we run this code?
java.lang.Object@1540e19d
String
[String, (this Collection), java.lang.Object@1540e19d] <<
Exception in thread "main" java.lang.ClassCastException


*/