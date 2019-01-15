package MyTestPreparation03;

public class T48_DataTypes {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(arr[arr[1]]);
    }
}


/*
What will be the result if you try to run this code?
1
2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
The code will not compile

This will cause an ArrayIndexOutOfBoundsException. Take a careful look at what we are trying to print. (arr[arr[1]]) This will get arr[1] which is equal to 2 and this means that we are trying to access a third element in this array (arr[2] - array index count starts from 0).
*/