package MyTestPreparation03;

public class T30_DataTypes {
    public static void main(String[] args) {
        test();
    }

    static void test() {
        Square30 square = new Square30();
        square.bSide = 4;
        /* INSERT CODE HERE */
    }
}

class Square30 {
    static int aSide = 20;
    int bSide = 20; //aSide
}
/*
How can we make the square object be eligible for garbage collection?

square.aSide = null;
square.bSide = null;

square.destroy()

square = null;

System.gc()


*/