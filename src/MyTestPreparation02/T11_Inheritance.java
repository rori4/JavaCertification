package MyTestPreparation02;

public class T11_Inheritance {
    public static void main(String[] args) {
        String a = "test";
//        if(a not instanceof Object){}
//        if(a !instanceof Object){}
        if(a instanceof Object){}
        if(!(a instanceof Object)){}
//        if(a instanceof !Object){}
    }

}

/*
Which of the following will not cause a compilation error? (multiple)
a
b
c
d
e
f

The only way to use instance of is to define it like "if(a instanceof Object){}". The condition check will return true or false. The ONLY way you can check if a certain variable is NOT instance of is to use it like this -> "if(!(a instanceof Object)){}"
*/
