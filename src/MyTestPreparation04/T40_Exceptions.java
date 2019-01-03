package MyTestPreparation04;

public class T40_Exceptions {
    public static void main(String[] args) {
        int[] a = new int[1];
        System.out.println(a[calc()]);
    }

    public static int calc() {
       int calc = 1/(int)0.6;
       return 1;
    }
}

/*
What will be the result of running this code/
Exception in thread "main" java.lang.ArithmeticException: / by zero
Exception in thread "main" java.lang.NullPointerException
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
0
null


*/