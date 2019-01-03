package MyTestPreparation01;

public class T45_Inheritance {
    public static void main(String[] args) {
        A45 b = new B45();
        System.out.println(((B45) b).number());
    }
}

class A45 {
    public long number() {
        return 1;
    }
}

class B45 extends A45{
   /* public int number() {
        return 2;
    }*/
}

/*
Compile time error
A ClassCastException
1
2

int vs long

*/