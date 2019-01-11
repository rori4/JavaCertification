package MyTestPreparation01;

public class T54_DataTypes {
    public static void main(String[] args) {
        T54_DataTypes t1 = new T54_DataTypes();
        new T54_DataTypes();
        t1 = null;
        System.gc();
    }

    @Override
    protected void finalize(){
        System.out.println("object garbage collected");
    }
}

// finalize thrower is called on object once
// before garbage collecting it
/* What will be the output when running this code?

object garbage collected

object garbage collected
object garbage collected

The code will not print anything

The code will not compile;

The official exam objectives now explicitly mention Garbage collection.  All you need to know is:  1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object. 2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
*/