package Example;

public class A56_RightSubClass {
    /* Which one of these is a proper definition of a class TestClass that CANNOT be sub-classed?

    final class TestClass { } <<
    abstract class TestClass { }
    native class TestClass { }
    static class TestClass { }
    private class TestClass { }

    A final class cannot be subclassed.
    Although declaring a thrower static usually implies that it is also final, this is not true for classes. An inner class can be declared static and still be extended.
    Note that for classes, final means it cannot be extended, while for methods, final means it cannot be overridden in a subclass.
    The native keyword can only be used on methods, not on classes and or variables.

    */
}
