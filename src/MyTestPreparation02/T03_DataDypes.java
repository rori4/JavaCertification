package MyTestPreparation02;

public class T03_DataDypes {
    public static void main(String[] args) {
        try {
            float a = 0 / 0;
            if (a >= 0) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

/*
What will you get if you run this code?
java.lang.ArithmeticException: / by zero
1
2
The code will not compile


float number can be divided by zero. If you divide 0 by 0f you will get NaN and you you divide any other number by 0f you will get Infinity. Keep in mind that the 0 that you are dividing with should be annotated with 'f' to be known it is a float number. However you should remember that with integer numbers division by zero will throw an ArithmeticException.
*/