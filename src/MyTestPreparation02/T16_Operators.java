package MyTestPreparation02;

public class T16_Operators {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (a++ == --b) {
            if (a == ++b) {
                if (--a == -b) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            } else {
                System.out.println("3");
            }
        } else {
            System.out.println("4");
        }

    }
}
/*
What will we get as output?
1
2
3
4
The code will not compile.

*/