package MyTestPreparation02;

public class T10_Operators {
    public static int operators() {
        int a = -6;
        int b = --a;
        int c = -(--b);
        return -a-b-c;
    }

    public static void main(String[] args) {
        System.out.println(operators());
    }
}

/* -6+7+8  -7+7+8
What will you get if we run the code?

-7
9
8
7
The code will not compile


*/