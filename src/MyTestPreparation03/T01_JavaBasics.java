package MyTestPreparation03;

public class T01_JavaBasics {
    String name = "1";
    public static void main(String[] args) {
        String name = "2";
        System.out.println(name);
    }
}

/*
What will happen if we run this code?

It will print "1"
It will print "2"
It will not compile
We will get a runtime error

In Java, you are allowed to have an instance variable, and a local or parameter variable with the same name inside the same scope. When we call the variable inside the method we are going to call the local variable. This is why we are going to print "2" as a result.
*/
