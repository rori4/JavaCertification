package MyTestPreparation04;

public class T56_Arrays {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = new int[a++];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

/*
What will running this code give us as a result?
1 2 3 4
The code will throw an Exception <<
0 1 2 3 4
1 2 3 4 null
1 2 3 4 0



*/