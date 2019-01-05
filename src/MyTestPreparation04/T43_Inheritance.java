package MyTestPreparation04;

public class T43_Inheritance {
    public static void main(String[] args) {
        T43_Vehicle a = new Fiat();
        T43_Inheritance b = (T43_Inheritance) a ;
        b.move();
    }
    public void move() {
        System.out.println("I am a car");
    }
}

class Fiat extends T43_Inheritance implements T43_Vehicle{
    public void move() {
        System.out.println("I am a fiat");
    }
}

interface T43_Vehicle {
    default void move(){
        System.out.println("I am a vehicle");
    }
}

/*
What will happen if we run this code?
The code will print "I am a fiat" <<<
The code will print "I am a car"
The code will print "I am a vehicle"
The code will throw java.lang.ClassCastException


This is basis of polymorphism
And it is supposed to work like that.

Any method is dispatched (selected/invoked) dynamically according to the actual type of the object in stead of the type by which it is being referred to.

When you cast the object to another type, you just refer it using another type. The actual type of the object is not changed. (And it can never change).

So the behavior that you are observing is as expected and it is designed to be that way. It's definitely not a limitation.

Hope this helps.
*/