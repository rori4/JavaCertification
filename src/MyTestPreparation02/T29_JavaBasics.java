package MyTestPreparation02;

public class T29_JavaBasics extends A29 {
    public A29 a = new T29_JavaBasics();
    volatile int b;
}

/* public */ abstract class A29{
    int a;
}

/*
What will be the result if we want to compile this code?
The code will compile with no problem
The class will fail to compile, since volatile is not a Java keyword
The class will fail to compile, since we can not initiate an abstract class.
The class will fail to compile, since you can not define an abstract class to be public. <<

*/