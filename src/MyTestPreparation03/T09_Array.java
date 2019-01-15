package MyTestPreparation03;

public class T09_Array {
    public static void main(String[] args) {
        int[] i = {2, 3, 4, 5};
        int[] k = {4, 3, 2, 1};
        System.out.println(i[(i = k)[1]]);
    }
}
/*
What will this code print if we run it
2
4
5
1
It will throw ArrayIndexOutOfBoundsException
The code will not compile

When we are making 'i' be equal to k we return 'k' and try to reach the element at position "3". This for the array 'i' is is the last element -> 5
*/