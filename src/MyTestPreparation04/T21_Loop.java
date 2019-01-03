package MyTestPreparation04;

public class T21_Loop {
    public static void main(String[] args) {
        Integer a = null;
        do {
            a+=1;
            System.out.println(a);
        } while (a!=1);
    }
}

/*
What will happen if we run this code?

Exception in thread "main" java.lang.NullPointerException

The code won't print anything

1

null

*/