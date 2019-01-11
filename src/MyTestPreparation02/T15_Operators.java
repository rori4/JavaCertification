package MyTestPreparation02;

public class T15_Operators {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = obj1;
        String str1 = "string";
        String str2 = "str".concat("ing");
        System.out.println(obj1 == obj2 && str1 == str2.intern() ? "true" : "false");
    }
}
/*
What will running this code give us?
true
false
Compile time error
Runtime error

In Java the difference between comparing Strings with == and .equals() is that this function checks the actual contents of the string, the == operator checks whether the references to the objects are equal. The process of combining identical strings is called "interning". When we run the method intern() java will intern all identical strings. This is why obj1 == obj2 will return true and str1 == str2.intern() will return true as well.
*/
