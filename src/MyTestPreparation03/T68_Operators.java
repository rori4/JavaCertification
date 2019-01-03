package MyTestPreparation03;

public class T68_Operators {
    public static void main(String[] args) {
        int i = 10;
//        System.out.println( i<20 ? solution1() : solution2() );
    }

    public static void solution1(){
        System.out.println("Black");
    }

    public static void solution2(){
        System.out.println("White");
    }
}


/*
What will we get if we run this code?
Black
White
The code will not compile
The code will throw an runtime error.



The code will not compile. You can't use void functions inside System.out.println
*/