package MyTestPreparation01;

public class T03_Methods {
    private T03_Methods(){
        apple = order("Apple");
    }

    static final String getBanana(){
        return order("Banana");
    }

    static String apple = order("Orange");

    String pineapple = order("Pineapple");

    String banana = getBanana();

    public static void main(String[] args) {
        T03_Methods test = new T03_Methods();
    }

    private static String order(String s){
        System.out.println(s);
        return s;
    }
}

/*


*/
