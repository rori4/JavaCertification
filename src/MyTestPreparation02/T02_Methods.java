package MyTestPreparation02;

public class T02_Methods {

    public static String calc(byte a, double b){
        return "byte double";
    }

    public static String calc(float a, double b){
        return "float double";
    }

    public static String calc(int a, float b){
        return "int float";
    }

    public static void main(String[] args) {
        System.out.println(calc(2,2.0));
    }
}

/*
What will we get when running this code?
A compile time error.
byte double
float double
int float


*/