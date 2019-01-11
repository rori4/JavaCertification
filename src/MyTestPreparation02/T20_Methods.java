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

Although we pass the integer to the method, in Java we always pass by value and not by reference. This means that inside the method we have are working with copies of our variables and not with them. So this is why the actual variable b is not changed to 0 after the line b=a. However after accessing the variable Test.b++; we have incremented the b value and this is why we get the answer "2".
*/

