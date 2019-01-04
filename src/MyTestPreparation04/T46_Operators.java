package MyTestPreparation04;

public class T46_Operators {
    public static void main(String args[]) {
        loop:
        for (int idx = 0; idx < 2; idx++) {
            boolean running = false;
            switch (idx) {
                default:
                    running = true;
                    break loop;
            }
//            if (running) System.out.println(idx);
        }
    }
}
/*
What will be the result of running this code?
0
1
2

0

1

The code will not compile <<

The code will not compile because the 'if' statement is unreachable.
*/