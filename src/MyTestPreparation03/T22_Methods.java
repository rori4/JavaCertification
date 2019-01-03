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



*/