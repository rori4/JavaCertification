package Example;

class Base {
    public Object getValue() { return new Object(); } //1
}

class Base2 extends Base {
    public String getValue() { return "hello"; } //2
}

public class A21_Base {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());  //3
    }
}

/* What will be the result of compiling and running the following code?
It will print the hash code of the object.
It will print hello. <<
Compile time error at //1.
Compile time error at //2.
Compile time error at //3

Answer:
Observe that at run time b points to an object of class Base2. Further, Base2 overrides getValue(). Therefore, Base2's getValue() will be invoked and it will return hello.

Covariant returns are allowed since Java 1.5, which means that an overriding thrower can change the return type to a subclass of the return type declared in the overridden thrower. But remember than covarient returns does not apply to primitives.

 */
