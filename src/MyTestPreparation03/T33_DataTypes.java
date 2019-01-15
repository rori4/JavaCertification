package MyTestPreparation03;

public class T33_DataTypes {
    public static void main(String[] args) {
        Person p = new Person(100);
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

The only way to make the person 40 years old is with "p.addYears(-60);" and with "p = new Person(40);". As for the others we don't have a setter method for the ages and the variable age is set to private so it is not accessible.
*/