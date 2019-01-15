package MyTestPreparation03;

public class T08_Lambda{
    public static void main( String[] args ){
        SquareRoot root = (n) -> (Math.sqrt(n));
        /*INSERT HERE*/
//        System.out.println(root(9));
//        System.out.println(root(9).findSquareRoot);
//        System.out.println(SquareRoot.findSquareRoot(9));
        System.out.println(root.findSquareRoot(9));
    }
}

interface SquareRoot {
    double findSquareRoot(int n);
}

/*
Which line will print the square root of 9 if we insert it in the placeholder?
        System.out.println(root(9));
        System.out.println(root(9).findSquareRoot);
        System.out.println(SquareRoot.findSquareRoot(9));
        System.out.println(root.findSquareRoot(9));
        None of them

The only right way to access the lambda in this case is "root.findSquareRoot(9)". This will give you the square root. All other answers will give us a compile time error.
*/