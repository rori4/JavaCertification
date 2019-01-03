package MyTestPreparation04;

public class T33_Methods {
    public static void main(String[] args) {
        String javascript = "Javascript";
        correct(javascript);
        System.out.println(javascript);
    }

    private static void correct(String javascript) {
        javascript.substring(4);
    }
}

/*
What will be the result of running this code?
Javascript
Java
Jav
script

Strings in java are immutable. (Explain more)


*/