package designpatterns.factory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS obj = osFactory.getInstance("Closed");
        obj.spec();
    }
}
