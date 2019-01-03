package MyTestPreparation02;

class Test {
    public int a = 2, b = 1;

    public Test(int a, int b) {
        a = a;
        b = b;
    }
}

public class T40_Methods {
    public static void main(String[] args) {
        Test test = new Test(1,2 );
        test.a = test.b;
        System.out.println(test.a + " " + test.b);
    }
}

/*
The code will not compile
1 1
2 2
1 2


*/
