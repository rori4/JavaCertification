package MyTestPreparation01;

import java.util.ArrayList;
import java.util.List;

public class T60_JavaAPI {

    public static void main(String[] args) {
        List<Mammal> mammals = new ArrayList<>();
        Animal animal = new Husky();
//        mammals.add(animal);
        System.out.println(mammals.get(0));
    }
}

abstract class Animal{
    @Override
    public String toString() {
        return "I am an animal";
    }
}

interface Mammal {

}

class Dog extends Animal implements Mammal{
    @Override
    public String toString() {
        return "Woof Woof";
    }
}

class Husky extends Dog{
    @Override
    public String toString() {
        return "Woof! I am a husky!";
    }
}

/*
What will we get if we run this code?
Compile time error
Woof Woof
I am an animal
Woof! I am a husky!
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0

*/