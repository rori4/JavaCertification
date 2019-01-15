package MyTestPreparation03;

public class T46_Inheritance extends Extension {
    private String name;

    public T46_Inheritance() {
        this.name = "A";
    }

    public static void main(String[] args) {
        System.out.println(new T46_Inheritance());
        System.out.println(new Extension());
    }

    public String toString() {
        return super.toString(this);
    }
}

class Extension {
    private String name;

    public Extension() {
        this.name = "B";
    }

    public String toString(Extension extension) {
        return extension.name + "1";
    }
}

/*
What will we get if we run this code?

A1
B1

B1
B1

B1
Extension@1540e19d

The code will not compile


B1 - >  You can give this to the super.toString thrower as it accepts Extension classes which our main class is extending. However in the Extension class the toString thrower does not override the toString thrower as it accepts the parameters. The toString thrower must not excepts any parameters in order to be overridden properly. This is why we get MyTestPreparation03.Extension@1540e19d or something like that as output.
*/