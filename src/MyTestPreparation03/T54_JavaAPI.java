package MyTestPreparation03;

public class T54_JavaAPI {
    public static void main(String[] args) {
        String java = "Java Programming";
        System.out.println(java.substring(8).substring(1,5).concat("y"));
    }
}

/*
What will you get if you run this code?
grammy
grammiy
rammy
Exception in thread "main" java.lang.StringIndexOutOfBoundsException
The code will not compile because you can't call substring on a substring
*/