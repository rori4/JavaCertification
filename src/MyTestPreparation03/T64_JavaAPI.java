package MyTestPreparation03;

public class T64_JavaAPI {
    public static void main(String[] args) {
        String a = "";
        StringBuilder sb = new StringBuilder(a);
        sb.append(a = a.concat("java"));
        a.concat(" programming");
        if (a == sb.toString()) {
            sb.append(" programming");
        }
        System.out.println(a);
        System.out.println(sb);
    }
}

/*
What will we get if we run this code?

java <<
java <<

java programming
java programming

java
java programming

java programming
java


Comparing string and string builder with ==
*/