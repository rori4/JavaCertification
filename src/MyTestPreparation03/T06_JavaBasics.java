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



*/