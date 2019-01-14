package MyTestPreparation02;

public class T56_Operators {
    static int sub(int a) {
        for (int i = 0; i < a; ++i) {
            a -= i;
            System.out.print((i+1)+") i="+i+" a="+a+"; ");
        }

        return a;
    }

    public static void main(String[] args) {
        int b = 2;
        b = b + b++ + + sub(6) + --b;
        System.out.println(b);
    }
}

/*
What will be the result of running this code?
9
11
The code will not compile
6


First let's take a look what we will get when we call "sub(6)" inside this code. In the for loop we are going to  decrease 'a' (which is 6 at the beginning) by i each loop until i < a. Here is what happens at each loop: 1) i=0 a=6; 2) i=1 a=5; 3) i=2 a=3; So at the end we are going to get 3. Now as for be we make it equal to a sequence of operations. b=2+2+3+2. This will result in a 9. Keep in mind here the difference between ++ or -- in front of a variable or behind it. After b++ we are going to make b=3 but use it in the equation as 2 and at the end we are going to decrease b from 3 to 2 and then use it as 2 in the equation.
*/
