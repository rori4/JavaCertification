package MyTestPreparation01;

public class T29_Inheritance {
    public static void main(String[] args) {
        A class1 = new C();
        B class2 = (B) class1;
        System.out.println(class1.name + " " + class2.getName());
    }
}

class A {
    String name = "A";

    String getName() {
        return name;
    }

}

class B extends A {
    String name = "B";

    String getName() {
        return name;
    }

}

class C extends B {
    String name = "C10";

    String getName() {
        return name;
    }
}

/*
A C10
A B
C10 B
A A
C10 C10
This will throw class cast exception


 */