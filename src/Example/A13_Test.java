package Example;
public class A13_Test {
    public static void main(String[] args){
        String hello = "Hello", lo = "lo";
        System.out.print((Example.Other.hello == hello) + " ");    //line 1
        System.out.print((Example.other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
        System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
        System.out.println(hello == ("Hel"+lo).intern());          //line 5
    }
}

class Other { static String hello = "Hello"; }


/*
https://stackoverflow.com/questions/30275117/why-concatenation-of-two-string-objects-reference-not-equal-to-same-content-stri

What will be the output of running class Test?
false false true false true
false true true false true
true true true true true
true true true false true
None of the above.
*/