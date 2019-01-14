package MyTestPreparation02;

public class T34_JavaAPI {
    public static void main(String[] args) {
        char a = "test".charAt(0);
        char b = "test".toCharArray()[0];
        char c = (char) "test".codePointAt(0);
//        char d = "d";
        char e = 97;
    }
}
/*
Which of the following chars will compile?
a and b
All of them
b and c
a and c
None of them will compile.

The only char that will not compile is char d = "d"; Using double quotes declares the text inside as a string even if it is one character. This is why we can't compile this char declaration.
*/