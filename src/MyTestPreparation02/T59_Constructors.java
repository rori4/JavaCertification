package MyTestPreparation02;

public class T59_Constructors {
    long a;

    private void T59_Constructors(long a) {
        this.a = a; //1
    }

    public int T59_Constructors(String a) {
        return (int) this.a;
    }

    public static void main(String args[]) {
        T59_Constructors a = new T59_Constructors();  //(1)
        a.T59_Constructors(5);  //(2)
        int b = a.T59_Constructors("Java");  //(3)
//        T59_Constructors c = new T59_Constructors(10L);  //(4)
    }
}

/*
Which will e the cause for the code to not compile
1
2
3
4

Line 4 will cause the code not to compile because we are do not have a valid constructor defined. "private void T59_Constructors(long a)" is a method, not a constructor. However, the class has a default constructor with no arguments. This is why line 1 is valid.
*/