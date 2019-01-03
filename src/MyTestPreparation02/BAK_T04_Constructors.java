package MyTestPreparation02;

import java.util.ArrayList;
import java.util.List;

public class BAK_T04_Constructors {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add((int)Float.MIN_VALUE);
        numberList.add((int) Double.MIN_VALUE);
        numberList.add(Integer.MIN_VALUE);
        System.out.println(find(numberList));

    }
    public static int find(List<Integer> numbers ){
        int p = 0;
        float f = Float.NEGATIVE_INFINITY;

        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) > f){
                f = numbers.get(i);
                p = i;
            } else{
                break;
            }
        }
        return p;
    }
}

/*
What will we get if we run this code?
0
1
2
-Infinity



*/