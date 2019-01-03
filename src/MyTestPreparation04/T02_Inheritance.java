package MyTestPreparation04;

public class T02_Inheritance extends Car implements Vehicle {
    public static void main(String[] args) {
        Vehicle a = (Vehicle) new T02_Inheritance();
        a.start();
    }
}

abstract class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

interface Vehicle{
    default void start() {
        System.out.println("Vehicle is starting");
    }
}

/*
What will be the result of running this code?
Car is starting
Vehicle is starting
The code will not compile
The code will throw a Runtime Exception


*/