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

*/
