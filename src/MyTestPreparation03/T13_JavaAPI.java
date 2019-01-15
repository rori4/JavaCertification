package MyTestPreparation03;

public class T13_JavaAPI {
    public static void main(String[] args) {
        System.out.println(getMsg(10));
    }

    public static String getMsg(int x) {
        String msg = "The number ";
        msg.concat("is ");
//        msg.concat(x);
        msg.toLowerCase();
        return msg;
    }
}

/*
The number
The number is 10
the number
The code will not compile

The code will not compile as we are trying to concat a String with integer. The concat method requires a String.
*/
