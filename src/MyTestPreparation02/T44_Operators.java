package MyTestPreparation02;

public class T44_Operators {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        if (a[0].equals("b"))
        if(a[1].equals("b")) System.out.println("b here");
        else System.out.println("not found");
    }
}
/* What will we get as a result if we run this code
b here
not found
We will have a compile time error
The code will not print anything but will compile and run successfully. <<



*/