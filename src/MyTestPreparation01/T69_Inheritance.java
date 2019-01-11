package MyTestPreparation01;

public class T69_Inheritance {
    public static void main(String[] args) {
        IBank bank = (IBank) new CentralBank();
        System.out.println(bank.getAccount());
    }
}

interface IBank {
    public default String getAccount() {
        return "1";
    }
}

interface ICentralBank extends IBank {
    default String getAccount() {
        return "2";
    }
}

class CentralBank implements ICentralBank{
}

/*
What will we get if we run this code
Compile time error
A Runtime Exception
1
2





*/
