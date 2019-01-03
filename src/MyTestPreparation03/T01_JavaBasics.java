package MyTestPreparation03;

public class T01_JavaBasics {
    private static String name = "1";
    public static void main(String[] args) {
        String name = "2";
        System.out.println(name);
    }
}

/*
What will happen if we run this code?

It will print "1"
It will print "2"
It will not compile
We will get a runtime error

*/
