package MyTestPreparation03;

public class T45_Loop {
    public static void main(String[] args) {
        int[] arr = {5, 12, 15};
        int x = 5;
        for (int a : arr) {
            while (a % x != (int)0.99) {
                System.out.println(x + " " + a);
                x++;
            }
            x += 3;
        }
    }
}

/*
What will we get if we run this code?
8 12
9 12
10 12
11 12

5 5

We will get an infinite loop that will not stop printing

The code will throw an error.


The key here is to know what will happen if we cast a decimal number to int.
If we are above 0 like 0.99 cast will give us 0. So it will round down.
If we are below 0 casting will round up. So if we cast -0.99 we still are going to get zero.
So we will be in the while loop until the division of the current array element and
x is NOT EQUAL to zero. The while loop will enter and continue to loop until the statement is TRUE.

So here are the steps that we have:
x=5;a=5 (5 % 5 = 0) -> skip while -> x += 3 -> x = 8 -> (no print)
x=8;a=12 (12 % 8 = 4) -> go in while -> x++ -> x = 9 -> PRINT: 8 12
x=9;a=12 (12 % 9 = 3) -> go in while -> x++ -> x = 10 -> PRINT: 9 12
x=10;a=12 (12 % 10 = 2) -> go in while -> x++ -> x = 11 -> PRINT: 10 12
x=11;a=12 (12 % 11 = 1) -> go in while -> x++ -> x = 12 -> PRINT: 11 12
x=12;a=12 (12 % 12 = 0) -> break while -> x++ -> x += 3-> x = 15 -> (no print)
x=15;a=15 (15 % 15 = 0) -> skip while -> x += 3 -> x = 18 -> (no print)
End code
*/