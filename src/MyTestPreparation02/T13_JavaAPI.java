package MyTestPreparation02;

public class T13_JavaAPI {
    public static void main(String[] args) {
        String String = "Java Programming";
        String string = String.trim();
        System.out.println(string.substring(2,8));
    }
}
/*
What will we get if we run this code?
va Pr
vaPro
ava P
avaPr
The code will not compile

The trim() method will delete all empty spaces before and after the string. This will not affect spaces between words. As for substring you should know that the counting of the string indexes start from 0 and when we use two numbers the first is where we start ,including the letter at that index, the second one is where we stop, excluding the letter in that position.
*/