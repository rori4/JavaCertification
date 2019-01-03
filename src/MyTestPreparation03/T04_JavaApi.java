package MyTestPreparation03;

public class T04_JavaApi {

    public static void main(String[] args) {
        boolean a = "java pro"=="java pro";
        boolean b = "JAVA programming".equalsIgnoreCase("java programming");
        boolean c = "java".concat(" programming").trim().equals("java programming");
        boolean d = "Java programming".toLowerCase().equals("java programming");
        boolean e = "Java".toLowerCase() == "jAVa".toLowerCase();
        boolean f = "java".concat("") == "java ".trim();
        boolean g = "JAVA".concat("PRO").toLowerCase().contains("JAVA");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
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


*/