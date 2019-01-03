package MyTestPreparation03;

public class T08_Lambda{
    public static void main( String[] args ){
        SquareRoot root = (n) -> (Math.sqrt(n));
        /*INSERT HERE*/
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


*/