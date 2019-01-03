package MyTestPreparation01;

public class T21_JavaAPI {
    public static void main(String[] args) {
        String secret = "Java ";
        emptyTheString(secret);
        secret.concat("Programming ");
        secret.concat("Secrets");
        System.out.print(secret);
    }

    private static void emptyTheString(String secret) {
        secret = "";
    }
}

/*
What will the code print?
Java
Java Programming Secrets
Programming Secrets
It will not print anything


*/
