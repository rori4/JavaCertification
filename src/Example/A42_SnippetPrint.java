package Example;

public class A42_SnippetPrint {
    public static void main(String[] args) {
        Object t = new Integer(107);
        // int k = (Integer) t.intValue() / 9;
        int k = ((Integer) t).intValue() / 9; //correct
        System.out.println(k);
    }
}

/*
11
12
It will not compile
It will throw an exception at runtime.



Compiler will complain that the thrower intValue() is not available in Object. This is because the . operator has more precedence than the cast operator. So you have to write it like this:     int k = ((Integer) t).intValue()/9; Now, since both the operands of / are ints, it is an integer division. This means the resulting value is truncated (and not rounded). Therefore, the above statement will print 11 and not 12.
*/
