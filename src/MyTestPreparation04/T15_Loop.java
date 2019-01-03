package MyTestPreparation04;

public class T15_Loop {
    public static void main(String[] args) {
        int c = 0;
        while (c++ > 0 | c != 0){
            System.out.println("Called");
            if (c > 2 ) break;
        }
    }
}

/*
How many times will this code print "Called"?

0
1
2
3 <<
This code will not compile


| c != 0
*/
