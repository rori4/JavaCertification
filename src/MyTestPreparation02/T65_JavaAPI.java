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


*/
