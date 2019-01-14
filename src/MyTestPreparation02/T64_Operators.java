package MyTestPreparation02;

public class T64_Operators {
    public static void main(String[] args) {
        int a = 2 + 7 * 4 - 10;
        int b = 2 + (7 * 4) - 10;
        int c = (2 + 7) * -(4 - 10);
        int d = 2 + 7 * (4 - 10) + 2;
        System.out.println("a="+a+"; b="+b+"; c="+c+"; d="+d);
    }
}
/*
Which of the following integers is the biggest?
a
b
c
d

The key for this question is to know the operator's precedence. For every integer we first do the calculation in brackets, then the multiplication, after that we do the addition. Here are what the different variables are as a result -> a=20; b=20; c=54; d=-38
*/