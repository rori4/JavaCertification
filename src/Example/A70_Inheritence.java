package Example;

public interface A70_Inheritence {
    public int A = 1; //1
    int B = 1;          //2
    static int C = 1;  //3
    final int D = 1; 	 //4
    public static int E = 1; //5
    public final int F = 1;  //6
    static final int G = 1;    //7
    public static final int H = 1; //8
}

/*
Which line(s) will cause a compilation error?
1
2
3
4
5
6
7
8
None <<

Any field in an interface is implicitly public, static, and final, whether these keywords are specified or not.
*/
