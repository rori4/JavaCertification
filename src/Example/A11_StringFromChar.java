package Example;

public class A11_StringFromChar {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
    }
}


/*
What will this print out?

true true
true false
false true
false false

*/