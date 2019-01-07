package MyTestPreparation01;

public class T24_Operators {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";
        String c = "orange";
        if(a.equals(a=b=c)){
            System.out.println("They are equal");
            System.out.print(a+" "+b+" "+c);
        } else {
            System.out.println("They are not equal");
            System.out.print(a+" "+b+" "+c);
        }
    }
}
/*
They are not equal
orange orange orange


They are equal
apple banana orange

They are equal
orange orange orange

They are not equal
apple banana orange

We will get compile time error

*/