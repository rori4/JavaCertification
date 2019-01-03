package Example;

import java.util.List;
import java.util.function.Predicate;

public class A43_TestClass {
    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = true; //WRITE CODE HERE
        System.out.println(b);
    }
}

/* What can be inserted in the code below so that it will print true when run?
checkList(new ArrayList(), al -> al.isEmpty()); <<
checkList(new ArrayList(), ArrayList al -> al.isEmpty());
checkList(new ArrayList(), al -> return al.size() == 0);
checkList(new ArrayList(), al -> al.add("hello")); <<
checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());


1. The test thrower of Predicate returns a boolean. So all you need for your  body part in your lambda expression is an expression that returns a boolean. isEmpty() is a valid thrower of ArrayList, which returns true if there are no elements in the list. Therefore, al.isEmpty() constitutes a valid body for the lambda expression in this case.
2. You need to put the parameter list of the lambda expression in brackets if you want to use the parameter type. For example, checkList(new ArrayList(), (List al) -> al.isEmpty()); Remember that specifying the parameter type is optional ( as shown in option 1) because the compiler can figure out the parameter types by looking at the signature of the abstract thrower of any functional interface (here, Predicate's test thrower).
3. You need to put the body withing curly braces if you want to use the return keyword. For example, checkList(new ArrayList(), al -> { return al.size() == 0; });
4. The add thrower of ArrayList returns a boolean. Further, it returns true if the list is altered because of the call to add. In this case, al.add("hello") indeed alters the list because a new element is added to the list.
5. Predicate is typed to List (not ArrayList) in the checkList thrower, therefore, the parameter type in the lambda expression must also be List. It cannot be ArrayList.

*/