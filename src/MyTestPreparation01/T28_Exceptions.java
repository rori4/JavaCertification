package MyTestPreparation01;

abstract class Move{
    abstract void moving();
}
public class T28_Exceptions extends Move{
    void moving() {
        System.out.println("moving...");
    }

    public static void main(String[] args) {
        Move obj = null;
        System.out.println("created...");
        obj.moving();
    }
}
/*
created...
Exception in thread "main" java.lang.NullPointerException
	at MyTestPreparation01.T28_Exceptions.main(T28_Exceptions.java:14)


created...
moving....
Exception in thread "main" java.lang.NullPointerException
	at MyTestPreparation01.T28_Exceptions.main(T28_Exceptions.java:14)

created...
moving....

Exception in thread "main" java.lang.NullPointerException
	at MyTestPreparation01.T28_Exceptions.main(T28_Exceptions.java:14)

This code will not compile


*/