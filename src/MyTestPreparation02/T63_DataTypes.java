package MyTestPreparation02;

public class T63_DataTypes {
    private double a = 0;
    public static int b = 5;
    public static void main(String[] args) {
//        a = 10;    // 1
        b = 6;       // 2
//        this.calc(); // 3
        m2();        // 4
    }

    public static void m1(){
        System.out.println("method1");
    }

    private static void m2(){
        System.out.println("method2");
    }
}

/*
Which of the flowing lines will cause a compilation error?
1
2
3
4

Because this refers to the object instance. There is no object instance in a call of a static thrower. But of course you can access your static field (only the static ones!). Just use
*/
