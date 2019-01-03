package Example;

public class A53_Question {
    /*
    Which of the following statements are acceptable?


    [YES] Object o = new java.io.File("a.txt"); (Assume that java.io.File is a valid class with a constructor that takes a String.)
    This is valid because every object in Java is an Object.

    [YES] Boolean bool = false;
    bool is a variable of type Boolean and not of a primitive type boolean however this is still valid because Java performs auto-boxing (and unboxing) for primitives and their wrapper types which allows false to be automatically be boxed into a Boolean false object.

    [YES] char ch = 10;
    Because 10 can fit into a char.

    [NO] Thread t = new Runnable(); (Assume that Runnable is a valid interface.)
    Since Runnable is an interface, it cannot be instantiated like this. But you can do : Runnable r = new Runnable(){                        
                        public void run(){ }                     
                        };

    [YES] Runnable r = new Thread(); (Assume that Thread is a class that implements Runnable interface)
Since Thread implements Runnable, this is a valid assignment.

    */
}
