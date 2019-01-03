package MyTestPreparation02;

public abstract class T14_Methods {
    int a;
    int b;
    volatile static double NAME; //1
    public abstract String getName(); //2

    public static void main(String[] args) { //3
        T14_Methods a = new A();
        System.out.println(a.getName());
    }
    static class A extends T14_Methods{ //4
        @Override
        public String getName() {
            return "Java";
        }
    }
}

/*
What will happen if we run this code?
The code will compile and print "Java"
The code will not compile because of line 1
The code will not compile because of line 2
The code will not compile because of line 3
The code will not compile because of line 4

*/