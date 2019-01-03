package MyTestPreparation01.T20_Inheritance.Dog;

/*
public class Dog extends Animal {
    Dog() {
    }

    public void eat() {
        System.out.println("Nom... Nom... Woof!");
    }

    public static void main(String[] args) {
       Animal dog = new Dog();
       dog.eat();
    }
}
*/

/*
It will print "Nom... Nom... Woof!"
It will print "Nom... Nom..."
It will not compile
It will throw IllegalArguemntException


Note that there is no modifier for A's constructor. So it has default access. This means only classes in package a can use it. Also note that class B is in a different package and is extending from A. In B's constructor the compiler will automatically add super() as the first line. But since A() is not accessible in B, this code will not compile.

*/
