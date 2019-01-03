package MyTestPreparation04;

import java.util.ArrayList;
import java.util.List;

public class T31_JavaAPI {

    public static void main(String[] args) {
        List<Byte> shortList = new ArrayList<>();
//        shortList.add(1);
//        shortList.add(2);
//        shortList.add(128);
        System.out.println(shortList);
    }
}


/*
[1, 2, 1]
[1, 2, -128]
[1, 2, 128]
The code will not compile <<

The code will not compile because short list expects Byte and we give it integers. In order for this to work we need to cast all elements to 'byte' so we can add them. If we do so the right answer WOULD HAVE BEEN [1, 2, -128] because the max value of Byte is 127 and we get an overflow to -128.
*/