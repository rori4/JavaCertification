package MyTestPreparation04;

public class T47_Methods {
    public static void main(String[] args) {
        customMethod();
    }

    private static void customMethod(String... strings) {
        System.out.println("Object is: " + strings);
    }
}

/*
What will happen if we try to run this code?
It will print: "Object is: [Ljava.lang.String;@1540e19d" <<<
It will print: "Object is: "
It will print: "Object is: []"
It will print: "Object is: null"
This code will not compile

*/
