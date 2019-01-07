package MyTestPreparation01;

interface BasicVehicle{
    int  maxSpeed = 1;
    public void start();
}

public class T18_Inheritance_Car implements BasicVehicle {

    private T18_Inheritance_Car(){
//        maxSpeed = 120;
    }

    public void start() {
        System.out.println("Vroom start! MaxSpeed: " + BasicVehicle.maxSpeed);
    }

    public static void main(String[] args) {
        BasicVehicle car = new T18_Inheritance_Car();
        car.start();
    }
}

/*

Vroom start! MaxSpeed: 120
Vroom start! MaxSpeed: 1
The code will not compile because we can't assign value to the variable maxSpeed as it is final
This code will not compile because we can't resolve BasicVehicle.maxSpeed



*/