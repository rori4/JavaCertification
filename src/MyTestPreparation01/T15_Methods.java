package MyTestPreparation01;

import java.util.ArrayList;
import java.util.List;

public class T15_Methods {
    public static void main(String args[]){
        method(null);
    }
    private static void method(Object o){
        System.out.println("Object");
    }

    private static void method(List list){
        System.out.println("List");
    }

    private static void method(ArrayList arrayList){
        System.out.println("Array List");
    }

    private static void method(int i){
        System.out.println("int");
    }
}
/*
Which of the following will be printed if we try to run this code?
*/
