package MyTestPreparation02;

public class T47_Loop {
    public static void main(String[] args) {
        if (Boolean.valueOf("true")) {
            System.out.print("a ");
        }

        if (Boolean.valueOf("1")){
            System.out.print("b ");
        }

        if (Boolean.valueOf("1.0")){
            System.out.print("c ");
        }

        if (Boolean.valueOf("tRUe")){
            System.out.print("d ");
        }
    }
}

/*
What will we get if we run this code?
a b c d
a d
a b
a b c
b



The Boolean.valueOf converts only strings that are equal to "true" and is not case sensitive.




*/