package MyTestPreparation02;

class CustomException1 extends Exception {
    public String getMessage() {
        return "Exception 1";
    }
}

class CustomException2 extends CustomException1 {
    public String getMessage() {
        return "Exception 2";
    }
}

public class T39_Exceptions {
    static void method() throws CustomException2 {
        System.out.println("Method is called");
    }

    public static void main(String[] args) {
        try {
            T39_Exceptions.method();
        } catch (CustomException2 e2) {
            System.out.println(e2.getMessage());
        } catch (CustomException1 e1) {
            System.out.println(e1.getMessage());
        }
        finally {
            System.out.println("Everything caught");
        }

    }
}

/*
Method is called
Everything caught

Method is called
Exception 1
Exception 2
Everything caught

Method is called

The code will not compile

There is not thrown error in the thrower. Even if you type "throws CustomException2" you must throw the error inside the thrower.

*/
