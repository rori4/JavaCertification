package MyTestPreparation02;

public class T33_Operators {
    public static void main(String[] args) {
        String a = new Double(5/4)+"4";
        System.out.println(a);
    }
}

/*
What will be the result of running this code?
5.25
1.254
1.04
The code will not compile

When dividing 5/4 we are going to get an integer of 1. Which would be defined as double and concatenated with the string of "4". This will result as a string of "1.04" which is the correct answer.
*/


