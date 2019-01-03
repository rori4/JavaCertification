package MyTestPreparation02;

public class T69_Methods {
    void m1(){
    }

    static void m2(){ }

    void m3(){
    }

    static void m4(){
    }


    public void caller() {
        m2(); //1
        new T69_Methods().m3(); //2
        this.m1(); //3
        this.m4(); //4
    }

    public static void main(String[] args) {
        T69_Methods _this = new T69_Methods(); //5
        _this.caller(); //6
    }
}

/*
Which of the following lines if any would cause a compile time error?
1
2
3
4
5
6
7
The code will compile with not problem.



*/
