package MyTestPreparation02;

public class T23_Exceptions {
    public static void main (String[] args) {
        int[] arr = new int[]{4,5,6,7};
        int i = arr[4];
        System.out.println("Hello: "+i);
    }
}
/*
What will this code print if we run it?
The code will not compile
Hello: 4
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
Hello: 7

*/