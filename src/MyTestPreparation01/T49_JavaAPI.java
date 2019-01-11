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

System.out.println(str.substring(str.startsWith("J"),str.endsWith("A"))); will not compile and str.remove("DEV") will not compile too as there is not such method remove that can be applied to String. A thing you should know here is that the count of the string beginIndex starts from 0. If you use .substring with one argument we will get a string that string that starts from this index until the end of the string. If we use two arguments we indicate the beginning index and the end index (which is not included). When we use .indexOf this will return the index of the first occurrence of the string or letter. Using .replace will replace all the occurrences of a given string in the string. The usage of .lastIndexOf should be obvious. It will return us the index of the last occurrence of the given string.
*/
