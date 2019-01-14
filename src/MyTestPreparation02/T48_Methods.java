package MyTestPreparation02;

public class T48_Methods extends A48 {
    void msg(Integer a) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        T48_Methods test = new T48_Methods();
        test.msg(1);
    }
}
class A48 {
    void msg(int msg){
        System.out.println("int");
    }
}

/*
Which will be printed when we run this code?
Integer
int <<
It will not compile as there is not thrower msg that receives integer.
The code will throw an exception.


The code will compile and run correctly and it will print "int". This is because when we give a method non-decimal number it is considered an int and we have the EXACT method that receives an int in class A. Keep in mind that we are not overriding msg in class Test. We are overloading it. This is why we are calling "msg(int msg)". If we called "test.msg(new Integer(1))" we would have printed "Integer". If we did not have msg method in the A class at all we would have used the "msg(Integer a)" method defined in Test class because of the compiler can autobox the number into Integer. If you don't know autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.
*/