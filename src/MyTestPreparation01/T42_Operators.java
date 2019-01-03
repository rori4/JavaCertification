package MyTestPreparation01;

public class T42_Operators {
    public static void main(String[] args) {
        Object a = 7.5f;
        int b = ((Integer) a).intValue()/2;
        System.out.println(b);
    }
}

/*
This will not compile
We will get 3
We will get 4
It will throw a ClassCastException

Float number can't be cast to an Integer.
*/
