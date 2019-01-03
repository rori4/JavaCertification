package MyTestPreparation02;

public class T48_Methods extends A48 {
    void msg(Integer a) {
        System.out.println("double");
    }

    public static void main(String[] args) {
        T48_Methods test = new T48_Methods();
        test.msg(1);
    }
}
class A48 {
    void msg(int msg){
        System.out.println("float");
    }
}

/*
Which will be printed when we run this code?
double
float
It will not compile as there is not thrower msg that receives integer.
The code will throw an exception.


int > float > double
*/