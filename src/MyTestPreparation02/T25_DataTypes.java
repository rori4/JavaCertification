package MyTestPreparation02;

public class T25_DataTypes {
    public static void main(String[] args) {
        int a = 5 / 2;
//        float b = 1000.0;
        double c = 10;
//        short d = Short.MAX_VALUE + 1;
        boolean e = 5 == 2;
    }
}
/*
Which of the following lines will fail to compile?
multiple choice
a
b
c
d
e
All of them will compile.


Variable b and d will cause a compile time error. In the case of the float number we need to add 'f' at the end so it can be defined properly. As for the short when we try to and 1 to the max value of short we going to get an integer which will not fit in short. This will cause a compile time error.
*/