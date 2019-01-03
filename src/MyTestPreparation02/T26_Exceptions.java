package MyTestPreparation02;

public class T26_Exceptions extends A26 {
    static int a = 10;

    public static void main(String[] args) {
        new T26_Exceptions();
    }

    public T26_Exceptions() {
        if(--a == 9){
            try {
                name();
                System.out.println("Solution");
            } catch (RuntimeException e){
                System.out.println("Runtime exception caught");
            } catch (Exception e) {
                System.out.println("Exception caught");
            }
        } else {
            System.out.println("Failed");
        }
    }
}

class A26 {
    void name() throws Exception {
        throw new Exception("My exception",new RuntimeException("This is the exception"));
    }
}

/*
What will we get if we run this code?
Runtime exception caught
Exception caught
Solution
The code will not compile
Failed



*/