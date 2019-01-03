package MyTestPreparation03;

import java.time.LocalDateTime;

public class T58_JavaAPI {
    public static void main(String[] args) {
        String stringDateWithTime = "<INSERT DATE HERE>";
        LocalDateTime localDateTime = LocalDateTime.parse(stringDateWithTime);
        System.out.println(localDateTime);

    }
}

/*
What can you insert in the placeholder so it will parse correctly to LocalDateTime?

"2018-12-24T10:11:30" <<
"2018-12-24"
new Date().toString();
"2018/12/24"

You can use LocalDateTime.parse() on a String without providing it with a pattern, if the String is in ISO-8601 format.
The one example in ISO-8601 format is "2018-12-24T10:11:30".
*/
