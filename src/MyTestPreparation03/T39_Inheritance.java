package MyTestPreparation03;

public class T39_Inheritance {
    private String name;

    public static void main(String[] args) {
        T39_Inheritance  a = new B39();
//        B39 b = a;
//        System.out.println(b.getName());
    }

    public String getName() {
        return this.name = "George";
    }
}

class B39 extends T39_Inheritance {
    private String name;

    public String getName() {
        return name = "Peter";
    }
}

/*
What will we get if we run this code?
The code will print "Peter"
The code will print "George"
The code will not compile
The code will throw an error.

The code will not compile because B39 extends T39_Inheritance. In order to make a B39 class to be equal to 'a' you need an explicit cast to (B39);

*/