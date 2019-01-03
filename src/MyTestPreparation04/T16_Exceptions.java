package MyTestPreparation04;

public class T16_Exceptions {
    static int j = 1;

    public static void main(String[] args) {
        try {
//            throw ex(j);
        } catch (Error e) {
            System.out.println(j);
        }
    }

//    static Exception ex(int j) {
//        j = 10;
//        return new Error();
//    }
}


/*
What will happen if we try to run this code?
The code will not compile
The code will print 1
The code will print 10
The code will compile and run successfully but it won't print anything.

The code will not compile as Error does not inherit Exception. So we can not retunr Error to a method that should return an Exception.
*/

