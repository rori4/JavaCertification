package MyTestPreparation03;

public class T69_DataType {
    public static void main(String args[]) {
        Object a, b, c;
        a = new String("Alpha");
        b = new String("Beta");
        c = "";
        c = b = a = c;
        System.out.println("" + c);
    }
}

/*
What will we get as output if we run this code?
Alpha
Beta
The code will print an empty string <<
The code will not compile



*/