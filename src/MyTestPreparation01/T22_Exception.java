package MyTestPreparation01;

import javax.activation.UnsupportedDataTypeException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T22_Exception {
    RuntimeException a = new NullPointerException();
    RuntimeException b = new ArithmeticException();
    RuntimeException c = new ArrayIndexOutOfBoundsException();
    RuntimeException d = new IllegalArgumentException();
    RuntimeException e = new ClassCastException();
    IOException f = new FileNotFoundException();
    IOException g = new UnsupportedDataTypeException();
    Throwable h = new Error();

}

/*
Which of the following are exceptions extend RuntimeException?

*/