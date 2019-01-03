package Example;

public class A16_Test {
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1 + " " + val2);
    }
}

/*What will the following code print?
10 9
10 10
6 9
6 10
5 11
*/
