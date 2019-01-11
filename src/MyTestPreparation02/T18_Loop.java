package MyTestPreparation02;

public class T18_Loop {
    public static void main(String[] args) {
        int result=0;
        for (int i = 0, j = 5, k = 8; i < 4; i++, k--, --j) {
            result = i+j+k;
//            System.out.println(i+") i:"+i+" j:"+j+" k:"+k+" result:"+result+"; ");
        }
        System.out.println(result);
    }
}
/*
What will happen if we run this code?
The code will not compile
16
17
10
11

The for loop is properly defined. You can have as many declared variables separated by comma like here in this example and you can also have multiple increments, decrements of variables like we have here as well. You can only have one termination criteria. Here are the results after each loop 0) i:0 j:5 k:8 result:13;  1) i:1 j:4 k:7 result:12;  2) i:2 j:3 k:6 result:11;  3) i:3 j:2 k:5 result:10;  Keep in mind here that we do not increase the result but each time we set a new value.
*/