package MyTestPreparation02;

public class T43_Arrays {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int [] c = {10, 20};
        c[a++] = b = a;
        System.out.println(c[0]+" "+c[1]);
    }
}

/*
What will the code print if we run it?
1 20
0 20
10 0
10 1
The code will not compile

*/
