package Example;

public class A66_Exceptions {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        //if (x / y) System.out.println("Good");
        //else System.out.println("Bad");
    }
}
/*
Good
Bad
Exception at runtime saying division by Zero.
It will not compile.
None of the above.

You need a boolean in the 'if' condition. Here, compiler sees that there is no way x/y can produce a boolean so it generates an error at compile time.
*/