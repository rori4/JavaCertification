package MyTestPreparation03;

public class T55_Loop {
    public static void main(String[] args) {
        int age = 5;
        do {
            for ( ; true ; ++age)
                break ;
            System.out.println("Axel is " + age);
            break;
        } while (true);
    }
}

/*
What will we get if we run this code?
We will get stuck in an infinite loop
The code will not compile
It will print "Axel is 5"
It will print "Axel is 6"


*/