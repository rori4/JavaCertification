package MyTestPreparation03;

public class T33_DataTypes {
    public static void main(String[] args) {
        Person p = new Person(100);
        p.addYears(-60);
        /* INSERT CODE HERE */
        System.out.println(p.getAge());
    }
}

class Person {
    private int age = 0;

    int getAge() {
        return age;
    }

    Person(int age) {
        this.age = age;
    }

    public void addYears(int years) {
        age += years;
    }
}

/*
What code should you add in the placeholder so you can make the person 40 years old and the code to print that?
(multiple)

 p = new Person(40); <<

 p.addYears(-60); <<

 p.setAge(40);

 p.age = 40;


*/