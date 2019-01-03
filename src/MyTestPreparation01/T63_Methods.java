package MyTestPreparation01;

public class T63_Methods extends A63{
    public String name = "Test";
    public String getMessage(){
        return "message interrupted";
    }

    public static void main(String[] args) {
        T63_Methods a = new T63_Methods();
        System.out.println("Class: " + a.name);
        System.out.println(a.getMessage());
        A63 b =  new T63_Methods();
        System.out.println("Class: " + b.name);
        System.out.println(b.getMessage());
    }


}

class A63 {
    public String name = "A";
    public String getMessage(){
        return "message received";
    }
}

/*
What will we get if we run this code?
Class: Test
message interrupted
Class: A
message interrupted

Class: Test
message interrupted
Class: A
message received


Class: A
message received
Class: A
message received

Class: Test
message interrupted
Class: Test
message interrupted

None of the above


*/