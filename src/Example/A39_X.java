package Example;

//in file /root/com/foo/X.java
// package com.foo;
public class A39_X {
    public static int LOGICID = 10;
    public void apply(int i){
        System.out.println("applied");
    }
}

//in file /root/com/bar/Y.java
// package com.bar;
//1  <== INSERT STATEMENT(s) HERE
class A39_Y {
    public static void main(String[] args){
        System.out.println(A39_X.LOGICID);
    }
}

/*
import static X;

import static com.foo.*;  -> Bad syntax. Package import does not use static keyword.

import static com.foo.X.*; -> This static import, although syntactically correct, will not help here because Y is accessing class X in X.LOGICID.

import com.foo.*; -> This is required because Y is accessing class X. static import of LOGICID is NOT required because Y is accessing LOGICID through X ( X.LOGICID). Had it been just System.out.println(LOGICID), only one import statement: import static com.foo.X.*; would have worked.

import com.foo.X.LOGICID; -> Bad Syntax. Syntax for importing static fields is:  import static <package>.<classname>.*; or import static <package>.<classname>.<fieldname>;
*/