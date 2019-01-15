package MyTestPreparation03;

public class T36_Operators {
    public static void main(String[] args) {
        test((byte) 'a');
    }

    public static void test(byte x){
//        switch(x){
//            case 97:
//                System.out.println("1");
//            case 'a':
//                System.out.println("2");
//                break;
//        }
    }
}

/*
If you know that the ASCII equivalent of 'a' is 97 will this code compile?

Yes, and it will print 1
Yes, and it will print 2
Yes, and it will print 1 and then 2
No, the code will not compile.

No the code will not compile because you can't have duplicate switch cases. 97 is equivalent to 'a'.
*/