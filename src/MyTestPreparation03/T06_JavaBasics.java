package MyTestPreparation03;

public class T06_JavaBasics {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("0");
        } else {
            System.out.println(args.length);
        }
    }
}

/*
What will the code print if we run it with the following command:
java T06_JavaBasics 1, 2

0
1
2
The code will fail to compile.


The code will print '2' if we provide it with two arguments. remember that .length will return for us the number of elements inside an array.
*/