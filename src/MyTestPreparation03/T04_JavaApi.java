package MyTestPreparation03;

public class T04_JavaApi {

    public static void main(String[] args) {
        boolean a = "java".concat("") == "java ".trim();
        boolean b = "JAVA programming".equalsIgnoreCase("java programming");
        boolean c = "java".concat(" programming").trim().equals("java programming");
//        boolean d = "Java programming".toLowerCase().equals("java programming");
        boolean e = "Java".toLowerCase() == "jAVa".toLowerCase();
//        boolean f = "java pro"=="java pro";
//        boolean g = "JAVA".concat("PRO").toLowerCase().contains("JAVA");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);
        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
    }
}

/*
Which of the following will return true?
a true
b true
c true
d true
e false
f false
g false

Here for this question you should know several things. First equalsIgnoreCase will compare strings no matter what the character cases they have. This is why b will be true. You should also know that "==" compares if the objects are pointing ti the same reference. This is why 'a' and 'd' are false. The .concat() method will attach to the string another string and will return it as a new string. This is why we can chain methods like .trim() and .equals() to it. At the end 'c' will also return true.
*/