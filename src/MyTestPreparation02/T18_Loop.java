package MyTestPreparation02;

public class T18_Loop {
    public static void main(String[] args) {
        int result=0;
        for (int i = 0, j = 5, k = 8; i < 4; i++, k--, --j) {
            result = i+j+k;
        }
        System.out.println(result);
    }
}
/*
What will happen if we run this code?
The code will not compile
16
17
10
11

*/