package MyTestPreparation03;

public class T16_Methods {
    public static void main(String[] args) {
        T16_Methods test = new T16_Methods();
//        String a = test.getMsg();
//        CharSequence b = test.getMsg();
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" ");
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
Java Programming
Java
Programming
The code will not compile
It will print nothing.

You can't have the two methods with the same method signature. The method signature includes the number of arguments and what does the method throw. However, this does not include the return type of the method. This is why the code above will not compile.
*/