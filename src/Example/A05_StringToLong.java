package Example;

public class A05_StringToLong {
    String mStr = "123";
    long m = 999;
}

/* Multiple choice!
Which of the following options when put at 999 will assign 123 to m?

new Long(mStr);
Long.parseLong(mStr);
Long.longValue(mStr);
(new Long()).parseLong(mStr);
Long.valueOf(mStr).longValue();

*/
