package MyTestPreparation04;

public class T36_Operators {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            start++;
            if (start % 2 == 0) {
                sum += start;
            }
        } while (++sum <= 10);
        System.out.println(sum);
    }
}

/*
What will be the result of running this code?

10
15
16
17
Compile time error





2 -> 2
3 -> 3
4 -> 8
5 -> 9
6 -> 16
17
 */