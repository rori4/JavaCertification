package MyTestPreparation02;

public class T46_Operators {
    public static void main(String[] args) {
        System.out.println(calc(7));
    }

    public static int calc(int n) {
        int a = 0;
        int b = 2;

        if((n * b) / (++a)>7 && a++ > 1){
            return n*a++;
        } else {
            return n*--b;
        }
    }
}


/*
What will we get if we run this code?
7
21
14
A compile time error.




*/