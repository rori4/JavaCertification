package MyTestPreparation04;

public class T34_Inheritance {

    public static void main(String[] args) {
        Vehicle34 a = new Fiat34();
        Vehicle34 b = new Motor34();
        Vehicle34 c = new Car34();
        if (a instanceof Car34) {
            System.out.println("a is a car");
        }
        if (b instanceof Fiat34){
            System.out.println("b is a Fiat");
        }
        if(c instanceof Object){
            System.out.println("c is an Object");
        }

    }
}

class Vehicle34 {}

class Car34 extends Vehicle34 {}

class Motor34 extends Vehicle34 {}

class Fiat34 extends Car34 {}

/*
What will be printed if we run this code?

a is a car
c is an Object


a is a car

a is a car
b is a Fiat

c is an Object


*/