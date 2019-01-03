package Example;

public class A44_MyFirstClass {
    public static void main(String[] args) {
        System.out.println(args[1]);
    }
}


/* Which of the following commands will compile and then print "hello"?
javac MyFirstClass
java MyFirstClass hello hello

(correct)
javac MyFirstClass.java
java MyFirstClass hello hello

javac MyFirstClass
java MyFirstClass hello

javac MyFirstClass.java
java MyFirstClass hello

Since the code is printing args[1] i.e. the second parameter, you need to specify "hello" as the second argument. The first argument is ignored by this code. If you do not specify two parameters, this code will throw ArrayIndexOutOfBoundsException because it will be trying to access the second element of an array of size 1.
*/

