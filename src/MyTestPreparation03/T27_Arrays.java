package MyTestPreparation03;

public class T27_Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][2] = 2; //1
        arr[2][1] = 3; //2
        arr[2][3] = 4; //3
        arr[4 - arr[0][2]][5-arr[2][1]] = 5; //4
    }
}

/*
Which is the first line if any that will cause ArrayIndexOutOfBoundsException?

line 3 <<
line 4
line 5
None of the lines will throw an exception

At line 2 we are trying to access the element of the multidimensional array at position [2]. The elements in the first dimension are 2 but we start counting from 0. This is why the last element of the first dimension will be arr[1] . This is the first line that we are going to have an ArrayIndexOutOfBoundsException.
*/