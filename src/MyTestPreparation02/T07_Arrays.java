package MyTestPreparation02;

public class T07_Arrays {

    public static void main(String[] args) {
        try {
            int i = 2;
            int arr[][][][] = new int[i][i++][i++][i++];
            System.out.print(arr.length);
            System.out.print(arr[1].length);
            System.out.print(arr[1][1].length);
            System.out.print(arr[1][1][2].length);
        } catch (IndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}

/*
What will you get when printing this?
2234
2222
2345
It will not compile
At some point it will print java.lang.ArrayIndexOutOfBoundsException: 2


*/

