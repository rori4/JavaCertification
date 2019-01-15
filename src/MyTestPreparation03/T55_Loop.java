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

The code will compile correctly. The for loop will break immediately as we have a break right below it. This means that age will not be incremented and the printed result will be "Axel is 5".
*/