package core.hello.singleton;

public class StatefulService {
    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

// 무상태 
//public class StatefulService {
//    public int order(String name, int price) {
//        System.out.println("name = " + name + ", price = " + price);
//        return price;
//    }
//}
