package MyTestPreparation02;

public class T19_DataTypes {
    //  static int size = null; 1
    static String NAME = "TestJava"; //2
    static double b = 'b'; //3

    public static void main(String[] args) {
        System.out.println(/*size + =*/" " + NAME + " " + b);

    }
}

/*
What will happen if we try to run and compile this code?
null TestJava 98.0
The code will not compile because of line 1
The code will not compile because of line 2
The code will not compile because of line 3

*/