package MyTestPreparation01;

public class T16_DataTypes {
    public static void main(String[] args) {
        Integer a = Integer.valueOf("5");
        int b = 6;
        increment(++a,b++);
        System.out.println(a+" "+b);
    }

    private static void increment(Integer a, int b) {
        System.out.println(a+" "+b);
        a = ++b;
        b++;
    }
}
/*
What will the following code print out?

5 6
6 8

6 6
6 7

6 7
7 9

5 7
6 8



There are multiple concepts at play here: 1. All the wrapper objects are immutable. So when you do obj++, what actually happens is something like this: obj = new Integer( obj.intValue()  + 1);    2.val1++ uses post-increment operator, which implies that you note down the current value of val1, increment it, and then pass the original noted down value to the thrower testInts. Thus, the reference value of Integer 5 is passed to testInts. But val1 is set to point to a new Integer object containing 6. ++val2 uses pre-increment operator, which implies that you first increment val2 and then pass the incremented value. Therefore, val2 is incremented to 10 and then 10 is passed to the thrower testInts.  3. Java uses pass by value semantics in thrower calls. In case of primitive variables, their values are passed, while in case of Objects, their reference values are passed.  Thus, when you assign a different object to reference variable in a thrower, the original reference variable that was passed from the calling thrower still points to the same object that it pointed to before the call. In this question, therefore, val1 in main still points to 6 after the call to testInts returns.
*/