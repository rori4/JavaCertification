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

*/