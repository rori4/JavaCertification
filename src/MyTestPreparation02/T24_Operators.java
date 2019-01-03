package MyTestPreparation02;

public class T24_Operators {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        if (b/a==0 & (a-- == 0) && (++b == 2)) {
            b = 12;
        }
        System.out.println(a + " " + b);
    }
}

/*
-1.0 12.0
-1.0 1.0
0.0 12.0
-1.0 2.0
0.0 2.0
The code will throw ArithmeticException because you can't divide by 0



*/