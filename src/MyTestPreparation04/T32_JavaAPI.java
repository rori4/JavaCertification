package MyTestPreparation04;

import java.util.ArrayList;
import java.util.List;

public class T32_JavaAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        for (String el : list) {
            if(el == "1" ){
                list.remove("1");
            }
        }
        System.out.println(list);
    }
}

/*
What will we get as a result of running this code?

[1, 2, 3, 1]

[2, 3, 1]

[2, 3]

This code will throw a runtime exception


Exception in thread "main" java.util.ConcurrentModificationException
*/