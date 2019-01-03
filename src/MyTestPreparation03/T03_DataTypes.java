package MyTestPreparation03;

public class T03_DataTypes {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int result = (b=a=c)+a+c+b;
        System.out.println(result);
    }
}

/*
12
9
4
The code will not compile


*/
