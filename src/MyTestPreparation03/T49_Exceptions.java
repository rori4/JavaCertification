package MyTestPreparation03;

public class T49_Exceptions {
    public static void main(String[] args) {
        long a = 12_00L;
        Integer b = null;

        try {
            b = Integer.parseInt(Long.toString(a));
            a = Long.parseLong(b.toString());
            System.out.println(a+b);
            throw new NullPointerException();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

/*
What will you get if you run this code?

2400
24
java.lang.NumberFormatException
java.lang.NullPointerException



*/
