package MyTestPreparation01;

public class T49_JavaAPI {
    public static void main(String[] args) {
        String str = "JAVADEV";


        System.out.println(str.replaceFirst(str.substring(4),""));
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(1,5));
        System.out.println(str.substring(0,str.indexOf('D')));
        System.out.println(str.substring(0,str.indexOf("DEV")));
//        System.out.println(str.substring(str.startsWith("J"),str.endsWith("A")));
        System.out.println(str.substring(str.indexOf("J"),str.lastIndexOf("A")));
        System.out.println(str.replace("DEV",""));
//        System.out.println(str.remove("DEV"));


        /**/
        System.out.println(/*INSERT CODE HERE*/);
    }
}

/*
Which lines if put in this code will make the program print "JAVA"?


*/
