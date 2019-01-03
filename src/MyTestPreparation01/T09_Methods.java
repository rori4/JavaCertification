package MyTestPreparation01;

import java.util.ArrayList;
import java.util.List;

public class T09_Methods {
    public static void main(String[] args) {
        List a = new ArrayList();
        List b = new ArrayList();
        addToList(a,b);
        System.out.println(a + " " + b);
    }

    private static void addToList(List a, List b) {
        a.add(new Integer("1"));
        b.add(new Integer("2"));
        a = new ArrayList();
        List c = new ArrayList();
        b = c;
    }
}

/*
[1][2]
[1][]
[][]
[][2]

https://javaranch.com/campfire/StoryPassBy.jsp
*/

