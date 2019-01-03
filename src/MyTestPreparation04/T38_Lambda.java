package MyTestPreparation04;


public class T38_Lambda {
    public static void main(String[] args) {
        /*INSERT CODE*/
        print(()-> System.out.println("Hello World!"));

        print(()-> {
            System.out.println("Hello World!");
        });

        print(()-> {
            System.out.println("Hello World!");
            return;
        });

//        print(()-> {
//            return "Hello World!";
//        });
//
//        print({System.out.println("Hello World!")});

        print(new Printer() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });
    }


    public static void print(Printer a) {
        a.print();
    }
}

interface Printer {
    void print();
}

/*
Which of the following codes can you insert in the placeholder so when running the program it will print "Hello Wold!"
a
b
c
d
e
f


*/