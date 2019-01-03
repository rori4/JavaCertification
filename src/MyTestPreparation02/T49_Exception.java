package MyTestPreparation02;

public class T49_Exception extends Error {
    public static void main(String[] args) {
        try{
            T49_Exception e = (T49_Exception) new Error();
            e.m1();
        } catch (IllegalArgumentException ex) {
            System.out.println("Illegal Argument");
        } catch (ClassCastException ex) {
            System.out.println("Class Cast Exception");
        }
    }
}


class Error {
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



*/