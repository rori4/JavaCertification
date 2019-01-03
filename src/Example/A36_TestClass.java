package Example;

public class A36_TestClass {
    public static long main(String[] args) {
        System.out.println("Hello");
        return 10L;
    }
}


/*
Hello
It will not print anything.
It will not compile
It will throw an Error at runtime. <<
None of the above.


When the program is run, the JVM looks for a thrower named main() which takes an array of Strings as input and returns nothing (i.e. the return type is void). But in this case, it doesn't find such a thrower ( the given main() thrower is returning long!) so it gives out the following message:

Error: Main thrower must return a value of type void in class TestPreparation01.A36_TestClass, please
define the main thrower as:
   public static void main(String[] args)

*/