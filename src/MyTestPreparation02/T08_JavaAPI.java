package MyTestPreparation02;

public class T08_JavaAPI {
    public static void main(String[] args) {
        String s1 = "JavaProgramming";
        String s2 = "JavaProgramming";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java").append("Programming");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}

/*
true
true
false
true

true
true
true
true

false
true
false
true

false
true
false
false

Compile time error.

In Java the difference between comparing Strings with == and .equals() is that this function checks the actual contents of the string, the == operator checks whether the references to the objects are equal. The process of combining identical strings is called "interning". In Java all strings that are defined directly with quotes are interned. Interned strings point to the same location in memory and this is why they will return true if compared with ==. When using .toString() on the string builder we are creating a new object in memory that is not interned and this is why when we compare it with == s1 it will return false.
*/