package MyTestPreparation02;

public class T57_DataTypes {
    public static void main(String[] args) {
        if (new Boolean("TrUe") == new Boolean(true)) {
            System.out.println("This is true");
        } else {
            if (new Boolean("TrUe")) {
                System.out.println("However, this is true");
                if(new Boolean(true)){
                    System.out.println("And this is true");
                }
            } else {
                System.out.println("This is false");
            }
        }
    }
}
/*
What will we get if we run this code
This is true

This is false

However, this is true
And this is true

However, this is true



Boolean class has two constructors - Boolean(String) and Boolean(boolean)
they do not point to the same boolean

Remember that '==' in Java compares the if the object reference are the same. As both Booleans are different objects we are going to return false. When we create a new Boolean we can use either a string of "true"/"false" (CASE INSENSITIVE) or true/false. Case insensitive means that even that we give the constructor "TrUe" it will still parse it to true with no problem.
*/


