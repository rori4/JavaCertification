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

In this question you should watch for the increment of 'a'. The if condition will be the following ((7*2)/1 > 7  && 1 > 1). Left side will give us true and the right side will give us false. So we will fall to the else statement where we multiply 7 by 1. Here you should remember that when we have -- or ++ in front of a variable the change of the variable by one happens before the operation. This is why we get 7 at the end.
*/