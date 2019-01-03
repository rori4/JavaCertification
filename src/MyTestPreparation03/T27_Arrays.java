package MyTestPreparation03;

public class T27_Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[1][2] = 1; //line1
        arr[0][2] = 2; //line2
        arr[2][1] = 3; //line3
        arr[2][3] = 4; //line4
        arr[4 - arr[0][2]][5-arr[2][1]] = 5; //line5
    }
}

/*
Which is the first line if any that will cause ArrayIndexOutOfBoundsException?

line 3 <<
line 4
line 5
None of the lines will throw an exception

*/