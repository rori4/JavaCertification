package MyTestPreparation03;

public class T21_Exceptions {
    public static void main(String[] args) {
        try {
            getError();
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e ){
            System.out.println(e);
        } catch (Error e) {
            System.out.println(e);
        }
    }

    private static void getError() throws Exception {
        getError();
        throw new RuntimeException();
    }
}

/*
What will we get if run this code?
java.lang.RuntimeException
java.lang.Exception
java.lang.StackOverflowError
The code will not compile

A thrower that calls itself creates recursive call which will make an infinite calls of itself if there is no logic to break this. This will throw a StackOverflowError  which extends Error. (Error does not extend Exception or RuntimeException)
*/