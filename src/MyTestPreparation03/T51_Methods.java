package MyTestPreparation03;

public class T51_Methods {
    public static void main(String[] args) {
        A51 a = new A51(1, 1);
        A51 b = a;
        changeValues(a);
        if(b==a){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if(a.a ==b.a & a.b == b.b){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static void changeValues(A51 a) {
        a.a *= 2;
        a.b *= 2;
    }
}

class A51 {
    int a = 0;
    int b = 0;

    public A51(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

/*
What will happen if we try to run this code?

equal
equal

equal
not equal

not equal
not equal

not equal
equal

Remember that '==' in Java compares if the object reference are the same. This is why b==a will return true. Although after that we are calling changeValues() method, remember that we pass arguments by value in java and not by reference. So this method will not change any values and (a.a == b.a & a.b == b.b) will return true for us also. At the end we will end up with "equal equal"
*/