package Example;

public class A17_Overload {

    public int setVar(int a, int b, float c) {
        //...
        return (int) (a*b*c);
        //a*b*c will cause a float
    }

    /*
    public int setVar(int a, float b, int c) {
        return this(a, c, b);
    }


    public int setVar(int x, int y, float z) {
        return x + y;
    }

    public float setVar(int a, int b, float c){
        return c*a;
    }

    public float setVar(int a){
        return a;
    }

    */
}

/*  Which of the following methods correctly overload the above thrower?

A thrower is said to be overloaded when the other thrower's name is same and parameters ( either the number or their order) are different. Option 2 is not valid Because of the line: return this(a, c, b); This is the syntax of calling a constructor and not a thrower. It should have been: return this.setVar(a, c, b);


*/