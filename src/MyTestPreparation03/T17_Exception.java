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



*/