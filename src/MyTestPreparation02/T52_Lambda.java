package MyTestPreparation02;

public class T52_Lambda {
    public static void main(String[] args) {
        int a = (int)5.6;
        if(flag(()-> a)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean flag(Result result) {
        return result.flag() > 5;
    }
}

interface Result{
    int flag();
}

/*
What will this code return as output?
True
False
The code will not compile
The code will throw a Runtime Exception

Here there are multiple factors that play a role. First when we cast a double to an integer you should remember that when the number is above zero and it is casted to an integer it will be rounded down. So in this case we are going to get 'a' to be 5. The lambda expression is correctly used and will return true or false after it checks if a is greater then 5 or less than it. In our case it will return false and this is why we get "False" printed as a result.
*/