package MyTestPreparation02;

public class T65_JavaAPI {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ORPavaJ");
        String s = "GRAMMING";
        sb.reverse();
        s.toLowerCase();
        sb.append(s);
        System.out.println(sb);
    }
}

/*
What will we get if wer run this code?
JavaPROGRAMMING
JavaPRO
Java
ORPavaJGRAMMING
JavaPROgramming

StringBuilder is a mutable object and Strings are immutable. This is why when we run "sb.reverse();" we are going to reverse the StringBuilder and it will stay changed. The .toLowerCase() will return a new String that is with all lower case characters however it will not change the variable itself. The ".append()" will attach the string to the end of the StringBuilder and at the end we are going to receive "JavaPROGRAMMING".
*/
