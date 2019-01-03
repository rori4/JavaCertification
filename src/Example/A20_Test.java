package Example;

public class A20_Test {
    public static void main(String[] args) {
        String abc = "";
        abc.concat("abc");
        abc.concat("def");
        System.out.print(abc);
    }
}

/* What will the following code print?

abc
abcdef
def
It will print empty string (or in other words, nothing). <<
It will not compile because there is no concat() thrower in String class.

Answer:
Strings are immutable so doing abc.concat("abc") will create a new string "abc" but will not affect the original string "".

*/