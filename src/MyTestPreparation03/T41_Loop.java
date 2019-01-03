package MyTestPreparation03;

public class T41_Loop {
    public static void main(String[] args) {
        int counter = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 2; k >= 0; k--) {
                if (k - j < 1) break;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
/*
What will be the result of running this code?
3
4
5
0
The code will not compile

Running through this loop we will get:
k:2 result:0 [2-0 = 2] ( 2 < 1) = false -> counter ++
k:1 result:0 [1-0 = 1] ( 1 < 1) = false -> counter ++
k:0 ->  continue;
k:2 result:1 [2-1 = 1] ( 1 < 1) = false -> counter ++
k:1 result:1 [1-1 = 0] ( 0 < 1) = true -> break;
k:2 result:2 [2-2 = 0] ( 0 < 1) = true -> break;
result:3 (3<3) = false -> break outer loop;
result counter = 3;
*/
