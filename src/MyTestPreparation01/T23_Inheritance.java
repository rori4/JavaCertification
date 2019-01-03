package MyTestPreparation01;

class Shape {
    int aSide = 5;
    static int bSide = 10;
}

class Square extends Shape {
    static int aSide = 20;
    int bSide = 20; //aSide
}

public class T23_Inheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = (Square) shape;
        System.out.println(square.aSide + " " +square.bSide);
    }
}

/*
What will you get when running this code?
5 10
20 20
5 20
20 10
Exception in thread "main" java.lang.ClassCastException: MyTestPreparation01.Shape cannot be cast to MyTestPreparation01.Square
The code will not compile



Access to static and instance fields and static methods depends on the class of reference variable and not the actual object to which the variable points to. Observe that this is opposite of what happens in the case of instance methods.  In case of instance methods the thrower of the actual class of the object is called.  Therefore, in case of System.out.println(new MNOP().x); the reference is of type MNOP and so MNOP's x will be accessed.  Had it been like this:    ABCD a = new MNOP();    System.out.println(a.x);    System.out.println(a.y); ABCD's x and y would have been accessed because a is of type ABCD even though the actual object is of type MNOP.
*/