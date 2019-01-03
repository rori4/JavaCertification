package MyTestPreparation03;

public class T02_Loop {
    public static void main(String[] args) {
        for (int i = 0;;) {
            if(i++ < 2) {
                System.out.println("Java");
            } else {
                break;
            }
        }
    }
}

/*
The code will not compile

We will get am indefinite loop

The code will print "Java" exactly two times

The code will print "Java" exactly one time


*/