package MyTestPreparation03;

public class T17_Exception {
    public static void main(String[] args) {
        int a = 0;
        try {
            a++;
            m1(a);
        } catch (Exception e) {
            a++;
            System.exit(0);
        } finally {
            a++;
        }
        System.out.println(a);
    }

    public static void m1(int a) throws RuntimeException {
        ++a;
    }
}
/*
What will we get if we run this code?
2
3
4
I will not print anything


The answer here will be 2. First we increase a by one and then we pass it to method m1. However, remember that in Java we pass by value not by reference so the change in the method to a will affect only its copy. And although we indicate that this method throws a RuntimeException we are not throwing anything. This is why we are going straight to finally where we increase 'a' by 1 one more time. Ad at the end we are going to print "2".
*/