package MyTestPreparation03;

public class T47_Loop {
    public static void main(String args[]) {
        int a = 1;
        int count = 0;
        do {
            count++;
        } while (a == count);
        System.out.println(count);
    }
}

/*
What will be the result of running this code?
1
2
This will be stuck in infinite loop
It will throw a runtime exception


*/

