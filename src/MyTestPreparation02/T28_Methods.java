package MyTestPreparation02;

public class T28_Methods {
    static String a = name();
    public static void main(String args[]){
        T28_Methods thisClass = new T28_Methods();
        a = "3 ";
        System.out.println(thisClass.a);

    }

    protected static String name() {
        System.out.print("1 ");
        return "1";
    }

    private static String age(){
        System.out.print("2 ");
        return "2";
    }

    static {
      a = age();
    }
}
/*
What will we get if we run this code?
1 2 3
3 1 2
2 1 2
The code will not compile

*/