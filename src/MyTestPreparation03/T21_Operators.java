package MyTestPreparation03;

public class T21_Operators {
    public static double getDouble(){
        return Double.parseDouble(String.valueOf("Java".indexOf("result")));
    }

    public static void main(String args[]) {
//        switch (getDouble()) {
//            case 0.0:
//                System.out.print("0");
//            case 1.0:
//                System.out.print("1");
//                break;
//            case -1.0:
//                System.out.print("-1");
//                break;
//            default:
//                System.out.println("Java");
//        }
    }
}

/*
The code will not compile
0 1
1 Java
-1 Java
-1

The code will not compile because switch case does not accept double.
*/