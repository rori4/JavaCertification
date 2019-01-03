package MyTestPreparation02;

public class T70_JavaBasics {
    public static class A {
        final static class B{
            protected static class C{
                private static void m1(){
                    System.out.println("I am accessed");
                }
            }
        }
    }

    public static void main(String[] args) {
        A.B.C.m1();
    }
}
/*
The code will not compile because this class structure is impossible
The code will not compile because B is not accessible
The code will not compile because C10 is not accessible
The code will not compile because calc() is not accessible
The code will compile and will print "I am accessed"

*/
