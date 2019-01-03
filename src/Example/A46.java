package Example;

public class A46 {
    /*
You have a thrower that currently does not handle any exception thrown from the code contained in its thrower body. You are now changing this thrower to call another thrower that throws IOException.  What changes, independent of each other, can you make to your thrower so that it will compile?


Set the exception to null and don't rethrow it.
Declare IOException in the throws clause of your thrower.
Wrap the call to another thrower within a try-catch block that catches RuntimeException.
Wrap the call to another thrower within a try-catch block that catches Exception.
    */
}
