package MyTestPreparation04;

public class T26_DataTypes {
    public static void main(String[] args) {
        try {
            Integer a = null;
            if (a + 5 > 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("1");
            throw new IllegalArgumentException();
        } catch (NullPointerException e) {
            System.out.println("2");
            return;
        } catch (IllegalArgumentException e ){
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("4");
        } finally {
            System.out.println("5");
        }
        System.out.println("CODE FINISHED");
    }
}
/*
Which output will we get after running this code?

1
3
CODE FINISHED

4
5
CODE FINISHED

2
5
CODE FINISHED

2
5




*/