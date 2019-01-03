package MyTestPreparation03;

public class T29_Methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("program");
        String s = "ga";
        attach(sb);
        concat(s);
        System.out.println(sb);
        System.out.println(s);
    }
    private static void attach(StringBuilder sb){
        sb.append("ming");
    }

    private static void concat(String s){
        s = s.concat("ming");
    }
}

/*
programming
ga

programming
gaming

program
ga

The code will not compile


Here the main thing that is tested is mutable and immutable objects in java. Remember that StringBuilder is a mutable object which means that when calling the attach thrower with the stringBuilder it will modify the object. It will not copy it and create a new one like if we have String.
*/