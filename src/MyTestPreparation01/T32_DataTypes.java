package MyTestPreparation01;

public class T32_DataTypes {
    public int price = 15;
    private static boolean sold;
    static final int CASH =100;

    static {
        sold = false;
    }

    public static void main(String[] args) {
        if(/*CASH > price &&*/ !sold){
            System.out.println("You have bought an apple");
        } else {
            System.out.println("All apples have been sold");
        }
    }
}


/* What will be the output if we run this block?

This code will not compile
You have bought an apple
All apples have been sold
We will get a runtime error.

This code will not compile because price is a not static and we are trying to reference it in a static block
*/