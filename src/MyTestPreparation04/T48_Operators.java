package MyTestPreparation04;

public class T48_Operators {
    public static void main(String[] args) {
        Integer a = 256;
        Integer b = 256;
        Integer c = 127;
        Integer d = 127;
        System.out.println((a == b) + " " + (c == d));
    }
}
/*
What will be the result of running this code?
true false
false true
false false
true true


TODO: Rewrite in own words
All the wrapper objects are immutable. When you do i++, what actually happens is something like this: i = Integer.valueOf( i.intValue()  + 1);  As you can see, a different Integer object is assigned back to i.

However, to save on memory, Java 'reuses' all the wrapper objects whose values fall in the following ranges:  All Boolean values (true and false) All Byte values All Character values from \u0000 to \u007f (i.e. 0 to 127 in decimal) All Short and Integer values from -128 to 127 So ==  will always return true when their primitive values are the same and belong to the above list of values.
*/