package MyTestPreparation02;

public class T60_JavaAPI {
    public static void main(String[] args) {
        String a = "sD#@$%SECRET23X$%";
        System.out.println(a.substring(6,11));
        System.out.println(a.substring(5,12));
        System.out.println(a.substring(6,12)); // <<
        System.out.println(a.substring(a.indexOf("S"),a.indexOf("T")));
        System.out.println(a.substring(a.indexOf("S"),a.indexOf("2"))); //<<
    }
}

/*
Which of the following will give us the string "SECRET"
a
b
c
d
e
f
g

*/
