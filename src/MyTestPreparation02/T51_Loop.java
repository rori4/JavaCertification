package MyTestPreparation02;

public class T51_Loop {
    public static void main(String[] args) {
        new T51_Loop().crazyLoop();
    }

    void crazyLoop(){
        int c = 0;
        LOOPER: do{
            c++;
            if (c > 3) break LOOPER;
            else c++;
        }
        while (c < 8);
        INFO: System.out.println(c);
    }
}

/*
The code will not compile
4
5
9
The code will compile but won't print anything




*/