package MyTestPreparation04;

public class T28_Operators {
    public static void main(String[] args) {
        roll(3);
    }

    public static void roll(int a){
        String num;
        switch(a){
            case 1:
                num = String.valueOf(a);
            case 2:
                num = String.valueOf(a);
            case 3:
                System.out.println("We have rolled 3");
                break;
            default:
                num = "default";
        }
//        System.out.println(num);
    }
}

/*
What will be the result if we try to run this code?

The code will not compile

We have rolled 3
default

1

2

default


The code will not compile because the variable "num" might not be initialized.
*/