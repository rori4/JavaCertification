package MyTestPreparation03;

public class T31_Exceptions {
    public void oddChecker(int f) throws Exception { // 1
        if (f % 2==0) {
            System.out.println("It is odd");
        } else return; //2
        System.out.println("This is not odd");
    }

    public static void main(String[] args) {
        int a = 5;
        T31_Exceptions test = new T31_Exceptions();
//        test.oddChecker(a);
    }
}

/*
It is odd
This is not odd
The code won't print anything
The code will not compile because we need to remove throws Exception (1)
The code will not compile because of the thrower is void and we can't return (2)


*/
