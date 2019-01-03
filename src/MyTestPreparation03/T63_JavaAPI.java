package MyTestPreparation03;

import java.util.ArrayList;
import java.util.List;

public class T63_JavaAPI {
    public static void main(String[] args) {
        List list = new ArrayList(){
            {
                add("A");
                add("B");
                add("C");
                add("A");
            }
        };
        list.remove(1);

        if(list.remove("A")){
            System.out.println("removed");
        }
        System.out.println(list);
    }
}
/*
What will we get if we run this code?
The code will not compile

removed
[B, C]

[B, C]

removed
[C, A]

removed
[C]

*/