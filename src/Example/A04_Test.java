package Example;

public class A04_Test {
    public static void main(String[] args) throws Exception{
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}

/*
What will be the output when the above code is executed?
a)i=6 j=6
b)i=5 j=6
c)i=5 j=5
d)i=6 j=5
e)none of the above
*/