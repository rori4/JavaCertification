package MyTestPreparation01;

public class T48_Operators {
    public static void main(String[] args) {
        int i = 0;
        boolean a = true;
        boolean b = false;
        if(a & checkOdd(++i)){
            if (a && checkOdd(i++)){
                if (b | checkOdd(i++)){
                    if(b || checkOdd(++i)){
                        System.out.println("everything has passed");
                    } else {
                        System.out.println("4");
                    }
                } else {
                    System.out.println("3");
                }
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("1");
        }
    }

    public static boolean checkOdd(int i){
        return (i % 2 == 1) ? true : false;
    }
}

/*
What will we get if we run this code
everything has passed
1
2
3
4
A compile time error

There are two things that you should know here. When you are using '++' with a variable it depends if it is in front of the variable or behind it. If it is in front it will increment the value first and after that run the line. If it is behind it will run the line then increment by 1. The same is for '--'. The other thing you need to know here is the difference between '&' and '&&' and '|' and '||'. If you use the || and && forms, rather than the | and & forms of these operators, Java will not bother to evaluate the right-hand operand alone.  It's a matter of if you want to short-circuit the evaluation or not. This means in the case of 'b || checkOdd(++i)' if b is true we will continue inside the if statement. and not run the method check odd which will also increase the value of i. In the case 'b | checkOdd(++i)', if b is true we are still going to check if i is odd and we will increment the value of i by 1.
*/