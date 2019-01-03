package MyTestPreparation01;


public class T38_Inheritance {
    public static void main(String[] args) {
        A38 a = new A38(); //1
        B38 b = new B38(); //2
        b = (B38)  a; //3
        a = (A38) b; //4
    }
}
class A38 {}
class B38 extends A38{}

/*
Which of the lines is wrong if any?
All of them are correct
line 1
line 2
line 3
line 4

*/