package Example;

interface T1 {
}

interface T2 {
    int VALUE = 10;

    void m1();
}

interface T3 extends T1, T2 {
    public void m1();

    public void m1(int x);
}

public class A51_Test {

/* What, if anything, is wrong with the following code?


T3 cannot implement both T1 and T2 because it leads to ambiguity.
There is nothing wrong with the code. <<
The code will work fine only if VALUE is removed from T2 interface.
The code will work fine only if calc() is removed from either T2 and T3.
None of the above.


Having ambiguous fields or methods does not cause any problem by itself but referring to such fields or methods in an ambiguous way will cause a compile time error. Having calc() in T3 is also fine because even though calc() is declared in T2 as well as T3 , the definition to both resolves unambiguously to only one calc(). Explicit cast is not required for calling the thrower calc() : ( ( T2) t).calc();  calc(int x) is valid because it is a totally independent thrower declared by T3.
*/
}
