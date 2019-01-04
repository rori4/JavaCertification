package MyTestPreparation04;

public class T52_Operators {
    public static void main(String[] args) {
        int a = 5;
        String result = "";
        switch (a) {
            case 5:
                result += a;
            case 1:
                result += a;
            case 2:
                result += a;
                break;
            case 3:
                result += a;
            case 4:
                result += a;
            default:
                result += a;
                break;
        }
        System.out.println(result);
    }
}
/*
What will be the result of running this code?
5
555 <<
5555
555555


//TODO: Explain
*/