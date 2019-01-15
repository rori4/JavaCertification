package MyTestPreparation03;

public class T43_Constructor {
    private String name;
    private T43_Constructor a;

    public T43_Constructor() {
    }

    public T43_Constructor(T43_Constructor a) {
        this.a = a;
        this.name = "Complex";
    }

    public static void main(String[] args) {
        T43_Constructor constructor = new T43_Constructor(new T43_Constructor());
        System.out.println(constructor);
    }

    public String toString() {
        return this.name;
    }
}

/*
T43_Constructor@1540e19d
Complex
The code will not compile
The code will throw IllegalArgumentException


The constructor of an object can receive itself as an argument with no problem. In our example above the code will compile and won't throw any errors. And as we have a toString method defined that returns for us the name of our Test object the correct answer here is "Complex".
*/