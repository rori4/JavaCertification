package MyTestPreparation01;

public class T19_Operators {
    public static void main(String[] args) {
        int a = 10;
        a += (a = 4) * ++a != 5 ? 10 : 2;
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

*/