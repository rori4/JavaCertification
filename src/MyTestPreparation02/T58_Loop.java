package MyTestPreparation02;

import java.util.ArrayList;
import java.util.List;

public class T58_Loop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C10");
        for (final String item : list) {
            list.set(list.indexOf(item),"Java");
        }
        System.out.println(String.join(", ", list));
    }
}
/*
A, B, C10
Java, Java, Java
The code will not compile
The code throw an exception



*/