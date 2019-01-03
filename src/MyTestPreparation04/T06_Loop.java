package MyTestPreparation04;

public class T06_Loop {
    public static void main(String[] args) {
        loopTest(0);
    }
    public static void loopTest(int x){
        for (int i = x+5; --i > x++;) {
            System.out.print(x + " ");
        }
    }
}

/*
What are we going to get as a result of running this code?
1 2
1 2 3
5 4 3
5 4
The code will not compile

*/