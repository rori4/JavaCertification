package MyTestPreparation01;

public class T14_Arrays {
    static int i = 0;

    public static void main(String[] args) {
        String[] arr = new String[4];
        load(arr);
        output(arr);
    }

    static void load(String[] arr) {
        for (String str : arr) {
            str.concat(String.valueOf(i));
            i++;
        }
    }

    static void output(String[] arr){
        for (String str : arr) {
            System.out.println(str);
        }
    }

}

/*
Exception in thread "main" java.lang.NullPointerException
	at MyTestPreparation01.T14_Arrays.load(T14_Arrays.java:14)
	at MyTestPreparation01.T14_Arrays.main(T14_Arrays.java:8)


The code will not compile

null 0
null 1
null 2
null 3

0
1
2
3

null
null
null
null
*/