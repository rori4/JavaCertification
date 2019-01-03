package MyTestPreparation04;

import java.util.ArrayList;
import java.util.List;

public class T23_JavaAPI {
    public static void main(String[] args) {
        List list = new ArrayList(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        Integer a = list.subList(1,2).indexOf(1);
        System.out.println(a);
    }
}

/*
-1
1
2
0
null


*/