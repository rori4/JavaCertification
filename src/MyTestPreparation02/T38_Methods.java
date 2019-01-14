package MyTestPreparation02;

public class T38_Methods {
    public int name;
    public int getName() {
        return this.name;
    }
}
/*
Which is the right way to encapsulate the name attribute?
Make name private
Make name protected
Delete public
The field name was correctly encapsulated

The right encapsulation of the field name is making it private. This will protect it from change from other classes.
*/
