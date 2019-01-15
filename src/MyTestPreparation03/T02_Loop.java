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

The for loop is correctly created but it does not have a termination statement inside of it defined. Lucky for us we have an if statement that does this for us and also increments the 'i' variable by 1. We are going to get looped twice before hitting the break and leaving the loop. This is why we would print "Java" twice.
*/