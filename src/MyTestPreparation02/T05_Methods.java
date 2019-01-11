package MyTestPreparation02;

public class T05_Methods {

    public static void calc(byte a , Integer b){
        System.out.println("byte Integer");
    }

    public static void calc(Byte a, int b ){
        System.out.println("Byte int");
    }

    public static void main(String[] args) {
        byte a = new Byte("1");
        int b = 2;
//        calc(a,b);
    }
}

/*
What will happen if we try to run this code?
We won't be able to compile the code as we have ambiguous thrower call.
int int
Byte int
We will get a Runtime error.
*/
