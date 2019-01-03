package MyTestPreparation04;

public class T30_Arrays {
    public static void main(String[] args) {
    boolean[] bool = new boolean[1];
        if (bool[0]) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}

/*
What will be the result if we run this code?
The code will throw NullPointerException
1
2 <<
The code will not compile


When we create an empty array of booleans we get the default value of false for each one. So in this case we will get to print "2" with this code.
*/
