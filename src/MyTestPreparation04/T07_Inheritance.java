package MyTestPreparation04;

public class T07_Inheritance {
    public static void main(String[] args) {
        A07 a = new A07(42);
        A07 b = new B07("secret");
        System.out.println(a.getSecret() + " " + b.secret);
    }
}

class A07 {
    int secret;

    public A07(int secret) {
        this.secret = secret;
    }

    public int getSecret() {
        return secret;
    }
}

class B07 extends A07 {
    String secret;

    public B07(String secret) {
        super(42);
        this.secret = secret;
    }
}

/*
42 42 <<
42 secret
secret secret
The code will not compile


*/