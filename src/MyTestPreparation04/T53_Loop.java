package MyTestPreparation04;

public class T53_Loop {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 10; i <= 0; i--) {
            a++;
            if (i % 2 != 0) {
                a += 2;
            }
        }
        System.out.println(a);
    }
}
/*
What will we get as output if we run this code?
20
21
10
0 <<

The code will give us 0 TODO: Explain more...
*/