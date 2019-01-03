package MyTestPreparation02;

public class T20_Methods {
    private static int a = 0;
    private static int b = 1;

    public static void main(String[] args){
        setAB(a, b);
        System.out.println(b);
    }

    public static void setAB(int a, int b){
        b=a;
        T20_Methods.b++;
    }
}

/*
What will we get if we run this code?
0
1
2
The code will not compile


*/

