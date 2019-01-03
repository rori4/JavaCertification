package MyTestPreparation04;

public class T11_Inheritance extends A {
    public void m1(){
        System.out.println("B");
    }
    public static void main(String[] args){
        A a = new T11_Inheritance();
//        a.calc();
    }
}


class A {
    public void m1() throws Exception{
        System.out.println("A");
    }
}

/*
What will happen if we run this code?
It will print "A"
It will print "B"
The code will not compile
The code will throw a Runtime Exception


*/