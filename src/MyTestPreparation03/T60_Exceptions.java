package MyTestPreparation03;

public class T60_Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println("12345".charAt(6));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        } catch (IndexOutOfBoundsException e ){
            System.out.println("Index");
        }
//        catch (StringIndexOutOfBoundsException e ){
//            System.out.println("String");
//        }
    }
}

/*
What will happen if we try to run this code?
It will print "Array"
It will print "Index"
It will print "String"
The code will not compile

The code will not compile because StringIndexOutOfBoundsException extends IndexOutOfBoundsException abd this has already been caught.
*/