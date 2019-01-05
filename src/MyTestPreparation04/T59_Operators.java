package MyTestPreparation04;

public class T59_Operators {
    public static void main(String[] args) {
        int a = 10;
        a += (a = 4) * a++ != 5 ? 10 : 2;
        System.out.println(a);
    }
}

/*
What will be the result of running this code?
12
18
20
50
The code will not compile

TODO: Explain a += (a = 4) * a++ != 5 ? 10 : 2;
*/