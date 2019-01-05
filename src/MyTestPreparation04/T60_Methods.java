package MyTestPreparation04;

import java.util.ArrayList;
import java.util.List;

public class T60_Methods {
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
