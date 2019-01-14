package MyTestPreparation02;

public class T44_Operators {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        if(a[0].equals("b"))
        if(a[1].equals("b")) System.out.println("b here");
        else System.out.println("not found");
    }
}
/* What will we get as a result if we run this code
b here
not found
We will have a compile time error
The code will not print anything but will compile and run successfully. <<


As in C and C++, the if statement of the Java programming language suffers from the so-called "dangling else problem," illustrated by this misleadingly formatted example above. The Java programming language, like C and C++ and many programming languages before them, arbitrarily decrees that an else clause belongs to the innermost  if to which it might possibly belong. This is why we are not going to print anything.
*/