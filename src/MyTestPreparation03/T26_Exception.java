package MyTestPreparation03;

public class T26_Exception {
    private static int calc(int a) {
        int x = 9;
        try {
            if (a % 2 == 0) throw new RuntimeException("Number is odd.");
            else return x % 9;
        } catch (Exception e) {
            if (a > (int) 6.5) return a % 5;
            else return 4;
        } finally {
            return 6;
        }
    }

    public static void main(String args[]) {
        System.out.println(calc(6));
    }
}

/*
What will we get if we run this code?
4
1
0
6
Exception in thread "main" java.lang.RuntimeException: Number not even.

Although we are going to go through complicated checks here that  first in the try block we are going to throw an Exception and catch it with the catch block, at the end we are still going to go inside the finally method and return 6. This is why the answer here is 6.
*/
