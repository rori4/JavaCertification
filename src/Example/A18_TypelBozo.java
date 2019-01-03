package Example;

interface Bozo {
    int type = 0;

    public void jump();
}

public class A18_TypelBozo implements Bozo {
    public A18_TypelBozo() {
    //    type = 1; //This is in code but throws compile time error
    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {
        Bozo b = new A18_TypelBozo();
        b.jump();
    }
}

/*
What will the program print when compiled and run?

jumping...0
jumping...1
>> This program will not compile.
It will throw an exception at runtime.

Answer:
Fields defined in an interface are ALWAYS considered as public, static, and final. Even if you don't explicitly define them as such. In fact, you cannot even declare a field to be private or protected in an interface. Therefore, you cannot assign any value to 'type' outside the interface definition.

*/