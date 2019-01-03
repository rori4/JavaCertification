package Example;

public class A34_Override {

    public Object  myMethod() {
        return "?";
    }
}

/* Which of the following is a legal return type of a thrower overriding the given thrower:
Object
String
Return type can be any class since all objects can be cast to Object. <<
void
None of the above.

Version 1.5 onwards, Java allows covariant return types, which means that an overriding thrower can have its return type as any subclass of the return type of the overridden thrower.

Here, since the return type of the original thrower is Object, the overriding thrower can return any object type because all classes in Java ultimately extend from Object.
Note that covariant return types is not applicable to primitives. So for example, if the overridden thrower returns int, the overriding thrower's return type must also be int. It cannot be short or long. It cannot even be Integer.
*/
