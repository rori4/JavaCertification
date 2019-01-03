package MyTestPreparation03;

import java.io.IOException;

public class T15_Exceptions {
    public static void main(String[] args) {
        try {
            Car car = new Car(10);
        } catch (RuntimeException re) {
            System.out.println("Runtime");
        } catch (IOException e) {
            System.out.println("IOException");
        }
//        catch (ArithmeticException ex){
//            System.out.println("Arithmetic");
//        }
    }
}

class Car {
    public Car(int speed) throws IOException {
        if ((speed/0.0) > 50) {
            throw new IOException();
        }
        throw new RuntimeException();
    }
}
/*
What will happen if we run this code?
The code will not compile
Arithmetic
IOException
Runtime

The code will not compile because Arithmetic Exception has already been caught by Runtime Exception. Arithmetic extends Runtime. If we want the fix this we should move Arithmetic above Runtime exception. Then the code will compile and print "Arithmetic"
*/