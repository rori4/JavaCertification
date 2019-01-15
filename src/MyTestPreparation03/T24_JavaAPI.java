package MyTestPreparation03;

public class T24_JavaAPI {
    public static void main(String[] args) {
        "".toLowerCase();
        "".concat("");
        "".toString();
        Integer a = 5;
        a.compareTo(5);
        Double b = 3.2;
        b.byteValue();
        System.out.println("".compareTo("234423"));
    }
}

/*
Which of the following can be called on a String?
    toString(); <<
    compareTo(); <<
    byteValue();
    equalsIgnoreCase(); <<


You can call every thrower except byteValue(); toString can be called for every object although it is redundant in the case of string, but it still can be called.
*/