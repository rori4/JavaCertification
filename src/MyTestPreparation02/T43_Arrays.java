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

The code will print "1 20". This is because of the line " c[a++] = b = a;" Here we are setting c[0] which is 10 to be equal to b which to be equal to a (c[a++] = b = a;). This ultimately be equal to a. But a is incremented now and will be 1 so this is why we will get "1 20" as a result.
*/
