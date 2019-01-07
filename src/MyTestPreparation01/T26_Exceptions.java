package MyTestPreparation01;

public class T26_Exceptions {
    public static void main(String[] args) {
        try {
//            getAnError();
            System.out.println("1");
        } finally {
            System.out.println("2");
        }
        System.out.println("3");
    }

    private static void getAnError() throws Exception {
        throw new Exception();
    }
}

/*
2
Exception in thread "main" java.lang.Exception
	at MyTestPreparation01.T26_Exceptions.roll(T26_Exceptions.java:20)
	at MyTestPreparation01.T26_Exceptions.main(T26_Exceptions.java:8)

The code will not compile <<

1
2

1
2
3

Explain:
Will not compile because we don't annotate with throw or catch the exception
 */