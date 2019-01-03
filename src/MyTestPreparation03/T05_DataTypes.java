package MyTestPreparation03;

public class T05_DataTypes {
    static String NAME;
    static int AGE;

    {
        NAME = "Tom";
        AGE = 5;
    }

    public static void main(String[] args) {
        T05_DataTypes a = new T05_DataTypes();
        a.changeName("Peter");
        a.printNameAge(AGE);
    }

    public void printNameAge(int AGE){
        changeAge(40);
        System.out.println(this.NAME+ " is " + AGE + " years old.");
    }

    private void changeAge(int i) {
        AGE = i;
    }

    private void changeName(String peter) {
        NAME = peter;
    }
}

/*
Peter is 40 years old.
Tom is 5 years old.
Peter is 5 years old.
Tom is 40 years old.
The file will not compile.




*/