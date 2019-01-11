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

The key here as always is the weather or not the '++' or '--' is in front of the variable or behind it. If it is in front the comparison is done after the increment and if it is behind the increment is done after the comparison. So in this case we are going to have 1) a =0; b = 0; 2) a = 1; b=1; 3) a = 0; b =-1 which is false. The last if we don't decrease b but rather then that we compare a to -b. This is why we get false and 2 as an answer.
*/