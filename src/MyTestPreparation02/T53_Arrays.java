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

We are going to get ArrayIndexOutOfBoundsException. This is because arr.length in this case would give us 3. However when we want to access array elements by position we start from zero. So the last element in this case would be arr[2] but we are trying to access arr[3]. This will throw ArrayIndexOutOfBoundsException.
*/