package Example;

class A45Base{
    public short getValue(){ return 1; } //1
}
class A45Base2 extends A45Base{
   // public byte getValue(){ return 2; } //2
}

public class A45_BaseClass {
    public static void main(String[] args){
        A45Base b = new A45Base2();
        System.out.println(b.getValue()); //3
    }
}


/*
It will print 1
It will print 2.
Compile time error at //1
Compile time error at //2
Compile time error at //3

In case of overriding, the return type of the overriding thrower must match exactly to the return type of the overridden thrower if the return type is a primitive.
(In case of objects, the return type of the overriding thrower may be a subclass of the return type of the overridden thrower.)

*/