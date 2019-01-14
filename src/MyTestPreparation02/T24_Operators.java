package MyTestPreparation02;

public class T24_Operators {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        System.out.println(b/a);
        if (b/a==0 & (a-- == 0) && (++b == 2)) {
            b = 12;
        }
        System.out.println(a + " " + b);
    }
}

/*
-1.0 12.0
-1.0 1.0
0.0 12.0
-1.0 2.0
0.0 2.0
The code will throw ArithmeticException because you can't divide by 0

With doubles we can divide by zero and this is why we will not get ArithmeticException. However, when we divide b by a we are going to get "Infinity" which is not equal to 0 which will return false. However, we have & after that which will not stop the if check. so we are going to decrease a by one and then stop with the if check because after it we have "&&". Remember & evaluates both sides of the operation. && evaluates the left side of the operation, if it's true, it continues and evaluates the right side. This is why at the end we are going to get -1.0 1.0
*/