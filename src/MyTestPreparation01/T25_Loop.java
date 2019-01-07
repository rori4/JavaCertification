package MyTestPreparation01;

public class T25_Loop {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        for (int n : numbers) {
            if (Integer.valueOf("3").equals(n)) break;
            System.out.print(n+" ");
            if (Integer.valueOf("2").equals(n)) continue;
            System.out.print(n+" ");
        }
    }
}
/*
1 1 2

1 1 2 4 4

1 1 2 2


The code will not compile


*/