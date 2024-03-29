package Example;

public class A68_DataTypes {
    boolean b = true|false;
    /* Which of the following declarations is/are valid:
     1.  bool b = null;
     2. boolean b = 1;
     3. boolean b = true|false;
     4 bool b = (10<11);
     5. boolean b = true||false;


    1 and 4
    2, 3, and 5
    2 and 3
    3 and 5 <
    5

    bool is an invalid keyword. Therefore, 1 and 4 can't be right. (Although 1 could be right if bool were a user defined class but as per Java coding conventions, a class name should start with a capital letter.)  boolean b = 1; is wrong because you can only assign true or false to a boolean variable. 1 is an integral value it cannot be converted to boolean. Also note that boolean b = null; would be invalid as well because null is not a true or false value. A primitive (whether it is a boolean or an int or a double), can never be assigned null.  boolean b = true|false; and boolean b = true||false; are both valid and the difference between true|false and true||false is not material in this case. However, there is a lot of difference between | (and &) and || (and &&) as explained below:

    || and && perform short circuit evaluation, while & and | do not. Which means, if you use the || and && forms, Java will not bother to evaluate the right-hand operand if the result of the expression can be known by just evaluating the left hand operand.  Consider the following example.  Boolean b = true; if(b || foo.timeConsumingCall()) {       //entered here without calling timeConsumingCall() }  Another example:  String s = null; if(s != null && s.isEmpty())  //No NullPointerException because string.isEmpty() is not called. //If you use & instead of && , s.isEmpty will be called and a NullPointerException will be thrown.{         ... }
    */
}
