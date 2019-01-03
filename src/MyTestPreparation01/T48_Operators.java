package MyTestPreparation01;

public class T48_Operators {
    public static void main(String[] args) {
        int i = 0;
        boolean a = true;
        boolean b = false;
        if(a & chechOdd(++i)){
            if (a && chechOdd(i++)){
                if (b | chechOdd(i++)){
                    if(b || chechOdd(++i)){
                        System.out.println("everything has passed");
                    } else {
                        System.out.println("4");
                    }
                } else {
                    System.out.println("3");
                }
            } else {
                System.out.println("2");
            }
        } else {
            System.out.println("1");
        }
    }

    public static boolean chechOdd(int i){
        return (i % 2 == 1) ? true : false;
    }
}

/*
What will we get if we run this code
everything has passed
1
2
3
4
A compile time error
*/