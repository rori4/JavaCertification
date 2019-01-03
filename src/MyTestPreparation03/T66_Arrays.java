package MyTestPreparation03;

public class T66_Arrays {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
        System.out.print(arr[arr.length-1].length);
        System.out.print(arr[arr[0][1]][2]);
    }
}

/*
What will we get if we try to run this code?

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

310

25

36


310 is the answer.
*/
