package MyTestPreparation01;

public class T12_JavaAPI {
    public static void main(String[] args) {
        String java = "Java", va = "va";
        if(java == "Ja"+va) {
            System.out.print("1 ");
        } else {
            System.out.print("2 ");
        }

        if(java == ("Ja"+va).intern()){
            System.out.print("3 ");
        } else {
            System.out.print("4 ");
        }
    }
}

/*
2 3

1 4

2 4

1 3


*/
