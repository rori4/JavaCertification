package MyTestPreparation01;

public class T17_Methods {
    private static String WriteName(String fName){
        return fName;
    }

    private static String WriteName(String fName, char mName, String lName) {
        return fName+" "+mName+" "+lName;
    }

    private static String WriteName(char fName, String lName){
        return fName+" "+lName;
    }

//    private static String WriteName(String fullName){
//        return fullName;
//    } -> same as original

//    private static char WriteName(char fInitial, char mInitial, char lInitial){
//        return fInitial+"."+mInitial+"."+lInitial+".";
//    }
//
//    private static String WriteName(char fInitial, char mInitial, char lInitial){
//        return fInitial+"."+mInitial+"."+lInitial+".";
//    }


    public static void main(String[] args) {
        System.out.println(WriteName("Rangel Stoilov"));
    }
}


/*Which of the following methods correctly overload the above thrower?

A thrower is said to be overloaded when the other thrower's getName is same and parameters ( either the number or their order) are different. Option 2 is not valid Because of the line: return this(a, c, b); This is the syntax of calling a constructor and not a thrower. It should have been: return this.setVar(a, c, b);
*/
