package MyTestPreparation03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class T11_JavaAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collection<String> lisb = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
    }
}

/*
Which of those is true?

List<> is an interface and extends Collection <<
ArrayList is a class <<
Collection is a class and extends Iterable
None of them are true.

First Collection is an interface that extends Iterable and StringBuilder is not extendable as it is a final class. The other two statements are correct.
*/