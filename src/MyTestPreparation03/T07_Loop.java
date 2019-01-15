package MyTestPreparation03;

public class T07_Loop {
    public static void main(String[] args) {
        int a = 0;
        looper: for(int i = 0; i < 4; i++){
            while(true){
                a+=2;
                continue looper;
            }
//            a=i;
        }
        System.out.println(a);
    }
}

/*
3
6
4
The code will not compile

The code will not compile because "a=i" is an unreachable statement. When we go through the while loop we are always going to hit continue and go to the next for loop cycle. This makes "a=i" unreachable and it will not compile.
*/