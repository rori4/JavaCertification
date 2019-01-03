package MyTestPreparation01;

public class T30_Arrays {

    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5};
        long i = 5;
        try {
            arr = null;
//            System.out.println(arr[i--]);
        } catch (Exception e) {
            System.out.println();
        }
    }
}

/*
The code will not compile

5

java.lang.ArrayIndexOutOfBoundsException: 5

java.lang.NullPointerException
	at MyTestPreparation01.T30_Arrays.main(T30_Arrays.java:10)




Arrays require int for the position (explain more)
*/