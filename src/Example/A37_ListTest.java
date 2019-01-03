package Example;

import java.util.*;

public class A37_ListTest {
    public static void main(String args[]){
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(  s1.subList(1, 1) );
        s1.addAll(s2);
        System.out.println(s1);
    }
}
/* In which sequence will the characters a, b, and, c be printed by the following program?

The sequence a, b, c is printed. <<
The sequence a, b, c, b is printed.
The sequence a, c, b, c is printed.
The sequence a, c, b is printed
None of the above.

First, "a" and "b" are appended to an empty list. Next, "c" is added between "a" and "b".
Then a new list s2 is created using the sublist view allowing access to elements from index 1 to index 1(exclusive) (i.e. no elements ). (Note that if fromIndex and toIndex arguments t subList thrower are equal (as is the case in this question), subList returns an empty list.).
Now, s2 is added to s1.
So s1 remains :a, c, b

*/