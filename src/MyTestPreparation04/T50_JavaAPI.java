package MyTestPreparation04;

public class T50_JavaAPI {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = "";
        sb.append("");
        sb.delete(1,2);
        sb.reverse();
        a.toLowerCase();
        a.contains("a");
    }
}
/*
Which of the following methods can be used with a StringBuilder?
        .append("some text"); <<
        .delete(2,4); <<
        .reverse(); <<
        .toLowerCase();
        .contains("A");

toLowerCase and contains are methods that belong to String objects. All the others are methods that belong to StringBuilder.
*/
