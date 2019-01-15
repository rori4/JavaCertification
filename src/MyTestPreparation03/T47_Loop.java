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

The while loop will continue to loop true until a == count is not true. Remember that the first do goes trough and increases count by 1 and after that 'a' is equal to 'count' so we loop again. After the second loop count is equal to 2 and this is the right answer.
*/

