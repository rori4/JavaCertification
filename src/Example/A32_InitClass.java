package Example;

public class A32_InitClass {
    private static int loop = 15 ;
    static final int INTERVAL = 10 ;
    boolean flag ;
    //line 1
}


/* Given the following class, which of the given blocks can be inserted at line 1 without errors?
static {System.out.println("Static"); }
static { loop = 1; }
static { loop += INTERVAL; }
static { INTERVAL = 10; }
{ flag = true; loop = 0; }


INTERVAL is final and so it can never be changed after it is given a value.
flag is not static and so it can be accessed only from a non-static block. loop is static so can be accessed from any block.
*/

