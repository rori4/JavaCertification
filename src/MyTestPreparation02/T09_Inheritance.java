package MyTestPreparation02;

public class T09_Inheritance{
    public static void main(String[] args) throws Exception {
        Fiat a = new Fiat();
        Car b = (Car) a;
        Vehicle c = (Vehicle) b;
        a.drive();
        b.drive();
        c.drive();
    }
}

class Fiat extends Car {
    public void drive() {
        System.out.println("Fiat driving...");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving...");
    }
}

class Vehicle{
    public void drive() throws Exception{
        System.out.println("Vehicle driving...");
    }
}

/*
Fiat driving...
Fiat driving...
Fiat driving...

Fiat driving...
Car driving...
Vehicle driving...

Vehicle driving...
Vehicle driving...
Vehicle driving...

Exception in thread "main" java.lang.ClassCastException:...

*/