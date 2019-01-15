package MyTestPreparation03;

public class T31_Exceptions {
    public void oddChecker(int f) throws Exception {
        if (f % 2==0) {
            System.out.println("It is odd");
        } else return; //1
        System.out.println("This is not odd");
    }

    public static void main(String[] args) {
        int a = 5;
        T31_Exceptions test = new T31_Exceptions();
//        test.oddChecker(a); //2
    }
}

/*
It is odd
This is not odd
The code won't print anything
The code will not compile because we need to remove throws Exception (1)
The code will not compile because of the thrower is void and we can't return (2)

The method that we call is with a method signature that says that it throws an Exception. Although we are not actually throwing an Exception inside of the method we still need to handle this when we call the method.
*/
