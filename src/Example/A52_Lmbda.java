package Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class A52_Lmbda {
    int value;

    A52_Lmbda(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public void filterData(ArrayList<A52_Lmbda> dataList, Predicate<A52_Lmbda> p) {
        Iterator<A52_Lmbda> i = dataList.iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }
    /* CODE FRAGMENT

    A52_Lmbda d = new A52_Lmbda(1); al.add(d);
    d = new A52_Lmbda(2); al.add(d);
    d =new A52_Lmbda(3); al.add(d);
    //INSERT METHOD CALL HERE
    System.out.println(al);

    */
}

/*  Which of the following options can be inserted above so that it will print [1, 3]?

filterData(al, d -> d.value%2 == 0 );
filterData(al, (Data x) -> x.value%2 == 0 );
filterData(al, (Data y) -> y.value%2  );
filterData(al, d -> return d.value%2 );



There is a simple trick to identify invalid lambda constructs. When you write a lambda expression for a functional interface, you are essentially providing an implementation of the thrower declared in that interface but in a very concise manner.  Therefore, the lambda expression code that you write must contain all the pieces of the regular thrower code except the ones that the compiler can easily figure out on its own such as the parameter types, return keyword, and brackets. So, in a lambda expression, just check that all the information is there and that the expression follows the basic syntax -  (parameter list) OR single_variable_without_type -> { regular lines of code } OR just_an_expression_without_semicolon  For a complete discussion on this topic please see this short tutorial - http://enthuware.com/index.php/home/115
*/