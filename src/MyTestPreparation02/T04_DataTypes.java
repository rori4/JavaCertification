package MyTestPreparation02;

public class T04_DataTypes {
    public static void main(String[] args) {
        int a = (int) Double.MIN_VALUE;
        if( a > 0){
            System.out.println("1");
        } else if (a < 0){
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}

/*
What will you get if running this code?
1
2
3
The code will throw ClassCastException
The code will not compile


*/
