package MyTestPreparation02;

public class T53_Arrays {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[2] = "Java";
        System.out.println(arr[arr.length]);
    }
}
/*
Java
null
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
The code will not compile

new String[3] and accessing [0...2]
*/