package MyTestPreparation02;

interface A41{
    int a = 1;
    void run(int speed);
}

public class T41_Inheritance implements A41 {
    int a = 5;
    public void run(int a) {
        System.out.println("Running with " + this.a + " mph");
    }

    public static void main(String[] args) {
        T41_Inheritance test = new T41_Inheritance();
        test.run(10);
    }
}
/*
Running with 5 mph
Running with 10 mph
Running with 1 mph
The code will not compile

*/