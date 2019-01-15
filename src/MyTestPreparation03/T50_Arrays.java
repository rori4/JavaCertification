package MyTestPreparation03;

public class T50_Arrays {
    public static void main(String[] args) {
        int[][] outer = {{1, 2}, {3, 4}};
//        for (Integer[] inner : outer) {
//            for (float a : inner) {
//                System.out.print(a + " ");
//            }
//        }
    }
}

/*
What will happen if we try to run this code?
The code will not compile because int[] cannot be converted to java.lang.Integer[]
The code will not compile because int can not be converted to float
1.0 2.0 3.0 4.0
1 2 3 4



The right answer is "The code will not compile because int[] cannot be converted to java.lang.Integer[]". It is self explanatory. Although int can be converted to Integer they are different types and this will cause the compilation error.
*/