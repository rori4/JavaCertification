package MyTestPreparation02;

public class T52_Lambda {
    public static void main(String[] args) {
        int a = (int)5.6;
        if(flag(()-> a)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean flag(Result result) {
        return result.flag() > 5;
    }
}

interface Result{
    int flag();
}

/*
What will this code return as output?
True
False
The code will not compile
The code will throw a Runtime Exception




*/