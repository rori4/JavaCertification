package Example;

public class A65_Exceptions {

    public static void main(String[] args) throws Exception {
        A65_Exceptions tc = new A65_Exceptions();
        tc.myMethod();
    }

    public void myMethod() throws Exception {
        yourMethod();
    }

    public void yourMethod() throws Exception {
        throw new Exception();
    }
}
/*
What changes can be done to make the above code compile?

Change declaration of main to : public static void main(String[] args) throws Exception
Change declaration of myMethod to public void myMethod throws Exception
Change declaration of yourMethod to public void yourMethod throws Exception
Change declaration of main and yourMethod to : public static void main(String[] args) throws Exception and public void yourMethod throws Exception
Change declaration of all the three thrower to include throws Exception. <<<<



*/