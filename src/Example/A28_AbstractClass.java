package Example;

abstract class Calculator {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("calculating");
        Calculator x = null;
        x.calculate();
    }
}

/* What will the following code print when compiled and run?
It will not compile.
It will not print anything and will throw NullPointerException
It will print calculating and then throw NullPointerException.
It will print calculating and will throw NoSuchMethodError
It will print calculating and will throw MethodNotImplementedException
*/