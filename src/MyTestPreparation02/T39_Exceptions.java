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

Although the method() is with a signature that it throws a CustomException2, inside of it we don't really throw an error whatsoever. This is why we are only going to print "Method is called" and "Everything caught".
*/
