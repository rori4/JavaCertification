package MyTestPreparation02;

public class T54_JavaBasics {
    public void me1(){
        m2();
    }
    public static void main(String[] args) {
        T54_JavaBasics a = new T54_JavaBasics();
        a.me1();
    }
    public static void m2(){
        System.out.println("E");
    }

}

interface test54{
    public static final int a = 50;
}

/*
Which of the following is true?
You can call static methods from non-static methods
The only way to call non-static methods inside static methods is to have an instance of the class that contains the non-static method.
All variables defined in an interface are public static final implicitly
All of the answers

All of the answers are correct. A thing to note here is that interface variables are implicitly static and final because Java interfaces cannot be instantiated on their own.
*/
