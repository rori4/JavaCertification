package MyTestPreparation04;

public class T27_Operators {
    public static void main(String[] args) {
        String a = null;
        Integer i = null;
        if (a != null | i==a.length()){
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}

/*
What will be the output of this code?
1
2
This code will not compile
This code will throw NullPointerException

*/
