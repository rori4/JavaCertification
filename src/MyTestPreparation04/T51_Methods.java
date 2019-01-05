package MyTestPreparation04;

public class T51_Methods extends T51_Test {
    static final int a = Integer.parseInt(null);//1

    public T51_Methods(String a) {
        super(); //2
        System.out.println(a);
    }

    public static void main(String[] args) {
//        T51_Methods a = (T51_Methods) new T51_Test("A"); //3
//        System.out.println(this.a); //4
    }
}

class T51_Test {
    public T51_Test() {
    }
}
/*
Which of the following lines will give a compilation error?
1
2
3
4

Line 3 will not compile because T51_Test does not have a constructor that receives a String. It doesn't matter if we cast it. Line 4 will give a compilation error because we can't use this in a static method.

*/