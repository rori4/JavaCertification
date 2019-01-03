package MyTestPreparation03;

public class T65_Loоp {
    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

    public static void main(String[] args) {
        int i = 0;
        for (String day : days) {
            i++;
            if (i == 3) {
                break;
            } else {
                days[i] = day.substring(0, 3);
            }
        }
        System.out.println(days[2]);
    }
}

/*
What will be the result of running this code?

mon

tue

wed

The code will not compile


*/
