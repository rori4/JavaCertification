package MyTestPreparation02;

public class T62_Loop {
    public static void main(String[] args) {
        int a = 10;
        do {
            if(--a==9) continue; break;
//            System.out.print(a+ " ");
        } while (a>5);
    }
}

/*
What will be the result of running this code?
9 7 6 5
8 7 6 5
The code will not compile
It will not print anything



The code will not compile because it has an unreachable statement
the break will prevent anything below to be reachable.
*/