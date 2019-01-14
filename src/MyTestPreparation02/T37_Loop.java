package MyTestPreparation02;

public class T37_Loop {
    private int i;
    void rotate(){
        System.out.println(i);
        while (i<=4){
            for (int i = 0; i < 4; i++) {
                System.out.print("Java ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        T37_Loop a = new T37_Loop();
        a.rotate();
    }
}

/*
The code will not compile because i was not instantiated
This will print "Java Java Java Java" four times
This will print "Java Java Java Java" one time
This will be stuck in infinite loop printing "Java Java Java Java"

declaring private int i will give it a default value of 0 so the code will compile. However the code will be stuck in an infinite loop.


*/