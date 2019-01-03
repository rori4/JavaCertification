package MyTestPreparation01;

public class T05_DataTypes {
    public static void main(String[] args) {
        String str = "+003";
        long m = Long.valueOf(str).longValue();
        System.out.println(m);
    }
}

/*
0
3
Exception in thread "main" java.lang.NumberFormatException: For input string: "+003"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Long.parseLong(Long.java:589)
	at java.lang.Long.<init>(Long.java:965)
Will have a compilation error


*/
