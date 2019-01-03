package MyTestPreparation04;

public class T05_JavaBasics {
    public static int Main(String[] args) {
        System.out.println("1");
        m$n(new String[]{});
        return 1;
    }

    public static void m$n(String[] args) {
        System.out.println("2");
        MAIN(new String[]{null});
    }

    public static void MAIN(String... args){
        System.out.println(3);
    }

    final public static void main(String... args){
        System.out.println(Main(new String[]{""}));
    }
}
/*
What will we get as output if we run this code?
1
2
3
1

1
2
3

1

The code will not compile

*/


