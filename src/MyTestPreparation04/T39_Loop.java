package MyTestPreparation04;

public class T39_Loop {
    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        outer: for (int j = 0; j < 5; j++) {
            inner: for (int i = 0; i < 4; i++) {
                ++k;
                if (i < 3) continue outer;
                m++;
                break inner;
            }
        }
        System.out.println( k + ", " + m );
    }
}

/*
What will be the result of running this code?
5,0
....



*/
