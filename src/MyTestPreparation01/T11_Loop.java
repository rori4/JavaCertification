package MyTestPreparation01;

public class T11_Loop {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1, b = 0;  b <= --a; b++,  ++a){
            System.out.println("a="+ a + " b=" + b);
        }
        System.out.println("a="+ a + " b=" + b);
    }
}

/*
a=0 b=0
a=0 b=1

a=0 b=0
a=0 b=0

a=0 b=0

a=0 b=1

It will not compile



*/