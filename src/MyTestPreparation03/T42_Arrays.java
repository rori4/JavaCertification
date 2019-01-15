package MyTestPreparation03;

public class T42_Arrays {
    public static void main(String[] args) {
        T42_Arrays a = new T42_Arrays();
        a.getResult();
    }

    private void getResult() {
        int a = 5;
        Object[] objArr = new Object[]{this, new Object[]{2, 4, 5}, true, a, new int[]{1, 2, 4}};
        System.out.println(objArr[2]);
    }
}

/*
What will be the result of running this code
true
5
The code will not compile because we can't add 'this' to Object[]
The code will not compile because we can't add  Object[] to Object[]
The code will not compile because we can't add int to Object[]

Although primitives are not Objects since 1.4 java autoboxes the primitives into their object pendants and this is why we can add them to Object[]. If you try to get the class of objArr[2] you will get class java.lang.Boolean. 'this' references the current class which is also an object so we can add it.
*/
