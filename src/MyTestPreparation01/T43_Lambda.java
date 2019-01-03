package MyTestPreparation01;

import java.util.Arrays;

public class T43_Lambda {
    public static void main(String[] args) {
        int sum = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i >= 2)
                .map(i -> i * 3)
                .sum();
        System.out.println((float)sum);
    }
}

/*
What will we get when running this code?
Compile time error
15.0
9.0
It will throw a RuntimeException
It will throw a ClassCastException

*/
