package MyTestPreparation03;

public class T16_Methods {
    public static void main(String[] args) {
        T16_Methods test = new T16_Methods();
//        String a = test.getMsg();
//        CharSequence b = test.getMsg();
        StringBuilder sb = new StringBuilder("Java");
//        sb.append(" ");
//        sb.append(b);
        System.out.println(sb);
    }

//    public String getMsg() {
//        return "Java";
//    }
//
//    public CharSequence getMsg(){
//        return "Programming";
//    }
}

/*
Java Programming <<
Java
Programming
The code will not compile
It will print nothing.

//TODO: paraphrase
You cannot have more than one thrower in a class with the same signature. Method signature includes thrower name and the argument list but does not include return type. Therefore, the two getLoad() methods have the same signature and will not compile.
*/