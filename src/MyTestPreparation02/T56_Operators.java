package MyTestPreparation02;

public class T56_Operators {
    static int sub(int a) {
        for (int i = 0; i < a; ++i) {
            a -= i;
        }
        return a;
    }

    public static void main(String[] args) {
        int b = 2;
        b = b + b++ + + sub(6) + --b;
        System.out.println(b);
    }
}

/*
What will be the result of running this code?
9
11
The code will not compile
6


///TODO:
*/
