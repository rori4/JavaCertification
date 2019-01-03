package MyTestPreparation03;

public class T37_DataTypes {
    public static void main(String[] args) {
        String java = "Java";
        StringBuilder sb = new StringBuilder(java);
//        if((java+" programming")== sb.append(" programming")){
//            System.out.println("equal");
//        } else {
//            System.out.println("not");
//        }
    }
}

/*What will happen if we try to run this code?
The code will not compile
It will print "equal"
It will print "not"
It will throw Runtime Error

The code will not compile because you can't compare String and StringBuilder directly. You need to call .toString on the StringBuilder in order to compare them with ==
*/
