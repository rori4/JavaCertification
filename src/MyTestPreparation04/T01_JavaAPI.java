package MyTestPreparation04;

public class T01_JavaAPI {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.setLength(5);
        sb.setLength(3);
        sb.delete(0,2);
        System.out.println(sb.length()+sb.toString());
    }
}

/*
What will be the results of printing this code?

1v
4java
1a
2va



1) java
2) jav
3) v
*/
