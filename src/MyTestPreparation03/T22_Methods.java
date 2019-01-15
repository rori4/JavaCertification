package MyTestPreparation03;

public class T22_Methods {
    private int age = 0;

    public void setAge(int age){
        age = age;
    }

    public void changeAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        T22_Methods test = new T22_Methods();
        test.changeAge(10);
        System.out.print(test.age+" ");
        test.setAge(20);
        System.out.print(test.age+" ");
    }
}

/*
0 10
10 10
10 20
0 20


In the case of the method setAge we are not going to change the global variable age as we can't access it if we don't use the keyword this. So in this case we are setting the variable a that we pass to be equal to itself. This is why we are going to get "10 10" as a result.
*/