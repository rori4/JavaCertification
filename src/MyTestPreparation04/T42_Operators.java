package MyTestPreparation04;

public class T42_Operators {
    public static void main(String[] args) {
        double a = 5;
        boolean flag = a++ == 6 & --a == 5 || a++ ==5;
        System.out.println(a+ " " + flag);
    }
}
/*
What will be the result of running this code
6 false
5 true
6.0 true <<
5.0 false

*/