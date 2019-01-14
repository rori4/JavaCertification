package MyTestPreparation02;

public class T49_Exception extends CustomError {
    public static void main(String[] args) {
        try{
            T49_Exception e = (T49_Exception) new CustomError();
            e.m1();
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal Argument");
        } catch (ClassCastException ex) {
            System.out.println("Class Cast Exception");
        }
    }
}


class CustomError {
    void m1(){
        throw new IllegalArgumentException();
    }
}


/*
Illegal Argument
Class Cast Exception

Class Cast Exception

Illegal Argument

The code will not compile


When we create our Test object to be equal to an instance of CustomError and cast it to Test we are going to get a Class Cast Exception. The Test class is a subclass of CustomError not the other way around. This is why we are not allowed to make this cast.
*/