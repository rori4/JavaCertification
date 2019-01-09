package MyTestPreparation01;

public class T41_Inheritance {
    public static void main(String[] args) {
        B41 b = new C41(); //1
        b.hello();
    }
}

class A41 {
    public void hello(){
        System.out.println("Hello I am class A");
    }
}

class B41 extends A41 {

}

class C41 extends B41{
    public void hello() /*throws Exception*/ { // (2)
        System.out.println("Hello I am class C10");
    }
}

/*
What will we get if we run this code?
A compile time error for line 1
Hello I am class C10
Hello I am class B
A compile time error for line 2

*/