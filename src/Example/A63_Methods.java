package Example;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class A63_Methods extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new A63_Methods();
        System.out.println(b.h + " " + b.getH());
        A63_Methods bb = (A63_Methods) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}

/*
Beta 44 4 44 Baap 44 44 44
Baap 44 4 44 Beta 44 44 44
Beta 44 4 44 Beta 44 4 44
Beta 44 4 44 Beta 44 44 44 <<


Here, b refers to an object of class Beta so b.getH() will always call the overridden (subclass's thrower). However, the type of reference of b is Baap. so b.h will always refer to Baap's h.  Further, inside Beta's getH(), Beta's h will be accessed instead of Baap's h because you are accessing this.h ('this' is implicit) and the type of this is Beta.
*/