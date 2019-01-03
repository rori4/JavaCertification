package MyTestPreparation03;

public class T38_Loop {
    public static void main(String[] args) {
        int k = 0;
        while (k < 7) {
            for (; ; ) {
                if (k++ > 3) break;
                System.out.print(k + " ");
            }
        }
    }
}

/*
What will we get if we run this code?

The code will not compile

The code will print 1 2 3 4  and get stuck in infinite loop after that.

1 2 3 4

0 1 2 4 5 6

The code will compile and run. when we get k to be greater then 3 we will break the for statement but every time after that we will still get inside ad go throw the if statement that will increase the k value.
(Remember x++ makes the increment after the code has been executed)

*/