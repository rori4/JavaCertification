package MyTestPreparation04;

import java.util.ArrayList;
import java.util.List;

public class T44_JavaAPI {
    public static void main(String[] args) {
        List a = new ArrayList();
        char b = 'a';
        a.add(b);
        System.out.println(a.get(0).getClass());
    }
}
/*
class java.lang.Character
class java.lang.char
java.lang.char
The code will not compile

(Explain more)!
When we put primitives into an arrayList they get wrapped into objects so the class that we have would be class java.lang.Character
*/
