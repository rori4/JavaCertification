package MyTestPreparation01;

public class T33_JavaAPI {
    public static void main(String[] args) {
        Order order = new Order(1);
        System.out.println("I want to order a "+ order);
    }
}

class Order {
    private String myOrder;

    Order(int x) {
        switch (x) {
            case 1:
                this.myOrder = "steak";
            case 2:
                this.myOrder = "pizza";
                break;
            default:
                this.myOrder = "salad";
        }
    }
}

/*
I want to order steak
I want to order pizza
I want to order salad
I want to order a Order@1540e19d

You will get I want to order a Order@1540e19d because our Order class does not have a toString thrower.
*/
