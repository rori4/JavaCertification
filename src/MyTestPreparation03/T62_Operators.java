package MyTestPreparation03;

public class T62_Operators {
    public static void main(String[] args) {
        int x = 15, y = 30;
        int a, b;
        try {
            a = x % (int)-5.9;
            b = y / a;
            System.out.println(a);
            System.out.println(b);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic");
        } catch (ClassCastException ex){
            System.out.println("Cast");
        } catch (NullPointerException ne){
            System.out.println("NullPointer");
        }

    }
}
/*
What will this code print as a result if we run it?

-3
-10

Arithmetic <<

Cast

NullPointer

The code will not compile


The code will print Arithmetic because when we cast a negative double to integer it rounds up to the nearest integer. (In our case to -5)
using the modulus we will get 0 as a result because 15 is perfectly dividable to -5. After that when we try to divide by 0 we will get ArithmeticException.
*/