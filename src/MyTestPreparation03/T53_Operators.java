package MyTestPreparation03;

public class T53_Operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a==b!=a) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}

/*
What will happen if we run this code?

It will print 'true'
It will print 'false'
The code will not compile
The code will throw a Runtime Error

*/