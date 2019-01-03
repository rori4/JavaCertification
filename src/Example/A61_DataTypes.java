package Example;

public class A61_DataTypes {
    public static void main(String args[ ] ){
        byte b = -128 ;
        int i = b ;
        b = (byte) i;
        System.out.println(i+" "+b);
    }
}

/*
The compiler will refuse to compile it because i and b are of different types cannot be assigned to each other.
The program will compile and will print -128 and -128 when run . <<<
The compiler will refuse to compile it because -128 is outside the legal range of values for a byte.
The program will compile and will print 128 and -128 when run .
The program will compile and will print 255 and -128 when run .

byte and int both hold signed values. So when b is assigned to i, the sign is preserved.
*/