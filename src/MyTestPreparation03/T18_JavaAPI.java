package MyTestPreparation03;

import java.util.ArrayList;
import java.util.List;

public class T18_JavaAPI {
    public static void main(String[] args) {
        List a = new ArrayList<>(); //a
        a.add("str");
        a.add(1); //b
        System.out.println(a.get(a.indexOf("1"))); //c
    }
}

/*
The code will not compile because we haven't defined List properly
The code will not compile because we can't add integer after adding a string
The code will throw ArrayIndexOutOfBoundsException
The code will throw NullPointerException


The code will throw ArrayIndexOutOfBoundsException because there is no string "1" in the array so a.indexOf("1") returns -1 which is outside of the array.
*/
