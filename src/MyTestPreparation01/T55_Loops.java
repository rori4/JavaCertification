package MyTestPreparation01;

import java.util.HashMap;
import java.util.Map;

public class T55_Loops {
    public static void main(String[] args) {
        Map<Integer, String> map =  new HashMap<>();
        map.put(1, "First");
        map.put(2, "Second");
        map.put(3, "Third");
        map.put(4, "Java");
        /*
        for (String a: map) {
            if(a.length()<=5){
                System.out.println(a);
            }
        }
        */
    }
}

/*
What will we get if we run this code?

First
Third
Java

Java

First
Third

We will get a compile time error


You can not foreach a Map
*/