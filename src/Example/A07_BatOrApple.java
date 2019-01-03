package Example;

public class A07_BatOrApple {
    public void switchString(String input){
        switch(input){
            case "TestPreparation01/a": System.out.println( "apple" );
            case "TestPreparation01/b": System.out.println( "bat" );
                break;
            case "B" : System.out.println( "big bat" );
            default : System.out.println( "none" );
        }
    }

    public static void main(String[] args) throws Exception {
        A07_BatOrApple tc = new A07_BatOrApple();
        tc.switchString("B");
    }
}

/*
What will the following code print?

A)
bat
big bat
B)
big bat
none
C10)
big bat
D)
bat
E)
The code will not compile
*/
