package Example;

public class A54_NewClass {
    private Object o;
    void doSomething(Object s){  o = s;   }

    public static void main(String args[]){
        Object obj = new Object(); // 1
        A54_NewClass tc = new A54_NewClass(); //2
        tc.doSomething(obj); //3
        obj = new Object();    //4
        obj = null;    //5
        tc.doSomething(obj); //6
    }
}

/* Which is the earliest line in the following code after which the object created on line // 1 can be garbage collected, assuming no compiler optimizations are done?

Line 1
Line 2
Line 3
Line 4
Line 5
Line 6 <<


The official exam objectives now explicitly mention Garbage collection.  All you need to know is:
1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.

2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();

 */