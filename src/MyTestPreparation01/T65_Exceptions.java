package MyTestPreparation01;

public class T65_Exceptions {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
            throw new Exception();
        }
    }
}

/*
What will be the result of running this code.

A compile time error

A runtime error

java.lang.Exception

java.lang.Exception
Exception in thread "main" java.lang.Exception
	at MyTestPreparation01.T65_Exceptions.main(T65_Exceptions.java:10)


Exception in thread "main" java.lang.Exception
Exception in thread "main" java.lang.Exception

*/