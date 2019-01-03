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
*/