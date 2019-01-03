package MyTestPreparation04;

public class T37_JavaBasics {
    public static void main(String[] args) {
        System.out.println("Java " + 1 + (2 + 5));
    }
}

/*
What will be the result of running this code?
Java 17 <<
Java 8
Java 125
The code will not compile


The code will produce "Java 17". With priority is the expression in brackets which would gives us 7. However after that the plus will concatenate the numbers to the string and will not add them up.
*/
