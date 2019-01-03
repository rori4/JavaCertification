package MyTestPreparation02;

import java.time.LocalDate;
import java.util.Date;

public class T06_JavaAPI {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(new Date());
    }
}

/*
what will be the output of running the following code if the dates printed are correct?
2018-11-20
Tue Nov 20 18:56:16 EET 2018

Tue Nov 20 18:56:16 EET 2018
Tue Nov 20 18:56:16 EET 2018

2018-11-20
2018-11-20

There is no such thing as LocalDate.now() so the code will not compile.


*/