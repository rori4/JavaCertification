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
The code will throw a Runtime Exception

The key here is to understand what happens with "if (a==b!=a)". First we will compare a==b which is "false". Now that we have false we have (false!=a) which will give is true (false != true). So at the end we will print true.
*/