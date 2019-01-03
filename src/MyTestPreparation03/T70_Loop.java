package MyTestPreparation03;

public class T70_Loop {
    public static void main(String[] args) {
        int a = 0, b = 10;
        int c = 0;
        do {
            ++c;
        }while (a++ < --b);
        System.out.println(a + b + c);
    }
}

/*
What will be the output of the following code?
15
16 <<
17
The code will not compile



*/