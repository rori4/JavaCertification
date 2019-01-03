package MyTestPreparation01;

public class T04_Loop {
    public static void main(String[] args) {
        int a = 3, b = 7;
        while(b-- > a++) {
            if(b-- < 5) break;
        }
        System.out.println(a + " " + b);
    }
}

/*
5 3
5 4
4 3
3 5
infinite loop



*/
/*

public class T04_Loop {
    public static void main(String[] args) {
        int a = 3, b = 7;
        while(b-- > ++a) {
            if(b-- < 5) break;
        }
        System.out.println(a + " " + b);
    }
}


*/