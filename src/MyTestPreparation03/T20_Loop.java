package MyTestPreparation03;

public class T20_Loop {
    public static void main(String[] args) {
        int k = 2;
        do {
            k -= -1;
            System.out.print(k+" ");
        } while (k++ < 6);
    }
}

/*
3 5 7 <<
3 5
3 4 5
It will go in an infinite loop

*/