package MyTestPreparation03;

public class T67_Exceptions {
    static String result = "";

    public static void thrower(int i) {
        try {
            if (i == 2) {
                throw new ArithmeticException();
            }
            result += "j";
        } catch (RuntimeException e){
            result += "a";
        }catch (Exception e) {
            result += " ";
            return;
        } finally {
            result += "a";
        }
        result += "va";
    }

    public static void main(String args[]) {
        thrower(1);
        thrower(2);
        System.out.println(result);
    }
}

/*

javaaava <<

java a

java

javajava




*/
