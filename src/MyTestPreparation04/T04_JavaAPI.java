package MyTestPreparation04;

import java.time.LocalDate;

public class T04_JavaAPI {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(0, 0, 0);
        System.out.println(inputDate);
    }
}

/*
What are we going to as output if we run this code?

Exception in thread "main" java.time.DateTimeException <<
Thu Jan 01 02:00:00 EET 1970
This will print the current time
The code will not compile



*/