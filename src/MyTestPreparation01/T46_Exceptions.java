package MyTestPreparation01;

public class T46_Exceptions {
    public static void main(String[] args) {
        A46 a = new A46();
        System.out.println(a.hello());
    }
}

class A46 {
    public String hello() {
        return "Hello";
        //throw new IOException();
    }
}

/*
What should you do to make the code run?
one

remove throw new IOException();
add throw "throws IOException" to hello and main thrower
surround System.out.println(a.hello()); with a try catch block
add throw "throws IOException" to T46_Exceptions class and to A46 class
*/
