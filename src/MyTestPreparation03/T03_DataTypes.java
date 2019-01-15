package MyTestPreparation03;

public class T03_DataTypes {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int result = (b = a = c) + a + c + b;
        System.out.println(result);
    }
}

/*
12
9
4
The code will not compile

In this question we have defined the variables correctly separation them with coma. As for the result  we first say (b = a = c) which will make all variables equal to the last variable 'c' and return 'c' and after that we are going to add all the variables together. This makes 4x3 which is 12.
*/
