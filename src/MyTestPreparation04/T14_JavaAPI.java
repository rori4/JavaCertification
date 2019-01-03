package MyTestPreparation04;

import java.time.LocalDate;

public class T14_JavaAPI {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.parse("2019-01-01");
        dt.minusYears(1);
        dt.minusDays(1);
        System.out.println(dt);
    }
}

/*
What will be the result if we run this code?
The code will throw DateTimeParseException
2017-12-31
2018-12-31
2019-01-01
The code will not compile

LocalDate is not mutable. The minusYears and minusDays return a new object.
*/