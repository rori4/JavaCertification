package MyTestPreparation03;

public class T23_Array {
    public static void main(String[] args) {
        int [] a[] = new int[0][]; //1
        int[][] b = new int[0][]; //2
        if (a.equals(b)){
            System.out.println("1");
        } else {
                if (a[0].length == b[0].length){
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }
        }
    }
}

/*
What will we get if we run this code?
1
2
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
The code will not compile because of line 1
The code will not compile because of line 2


Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException because we have defines our new int[0][] and this makes an empty array. When you try to access a[0] you will get ArrayIndexOutOfBoundsException because the array has no elements.
*/
