package MyTestPreparation02;

public class T45_Exception {
    public static void main(String[] args) {
        double[] a = new double[10];
        try{
            modifyArray(a);
        } catch (Exception e){
            System.out.println("Caught global exception");
        }
    }

    static void modifyArray(double[] a) throws Exception{
        try {
            a[10] = 5/0.0;
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
}

/*
What will this code print if we run it?
Can't divide by zero
Array out of bound
Caught global exception
The code will not compile


Yes you can not divide by zero but with doubles you can divide to 0.0 and you will get Infinity as a result. If you divide by 0 however, even if it is a double you will get ArithmeticException
As for why we get array out of bound - the defined length of the array is 10 however we start counting from 0. So the array is numbers that are accessible are a[0...9]
*/