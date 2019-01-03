package Example;

abstract class Vehicle {
}

interface Drivable {
}

class Car extends Vehicle implements Drivable {
}

class SUV extends Car {
}

public class A60_JavaAPI {
    /* Which of the following options will fail to compile?

    ArrayList<Vehicle> al1 = new ArrayList<>(); al1.add(new SUV());
    ArrayList<Drivable> al2 = new ArrayList<>(); al2.add(new Dog());
    ArrayList<Drivable> al3 = new ArrayList<>(); al3.add(new SUV());
    ArrayList<SUV> al4 = new ArrayList<>(); al4.add(new Dog()); <<
    ArrayList<Vehicle> al5 = new ArrayList<>(); al5.add(new Dog());

    Since a Dog is not an SUV, you cannot add instances of Dog in an ArrayList of SUVs.
    */
}
