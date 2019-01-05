package MyTestPreparation04;

public class T55_Inheritance {
    public static void main(String[] args) {
        Vegetarian v1 = new Vegan();
        Vegetarian v2 = new Vegan("Vegan");
        System.out.println(v1.name + " " + v2.name);
    }
}

class Vegetarian {
    String name;

    public Vegetarian() {
    }

    public Vegetarian(String name) {
        this.name = "Vegetarian";
    }
}

class Vegan extends Vegetarian {
    String name = "Vegan";

    public Vegan() {
        super();
    }

    public Vegan(String name) {
        super(name);
    }
}

/*
What will be the result of running this code?
null Vegetarian
Vegetarian Vegetarian
Vegan Vegan
Vegetarian Vegan

*/