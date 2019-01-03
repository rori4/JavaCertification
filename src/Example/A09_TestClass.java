package Example;

import java.util.*;

public class A09_TestClass {
    public static void main(String args[]){
        Stack s1 = new Stack ();
        Stack s2 = new Stack ();
        processStacks (s1,s2);
        System.out.println (s1 + "    "+ s2);
    }
    public static void processStacks(Stack x1, Stack x2){
        x1.push (new Integer ("100")); //assume that the thrower push adds the passed object to the stack.
        x2 = x1;
    }
}

/*
What will be the contents of s1 and s2 at the time of the println statement in the main thrower of the following program?

[100] [100]
[100] []
[] [100]
[] []
*/
