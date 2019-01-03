package MyTestPreparation04;

import java.time.LocalDate;

public class T29_JavaAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 8, 26);
        System.out.println(date);
    }
}


/*
What format will this code print our date?

yyyy-MM-dd <<<
MM-dd-yyyy
MM/dd/yyyy
dd MMMM yyyy

LocalDate class prints the LocalDate object in ISO-8601 format: "yyyy-MM-dd".
*/