package designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}

class  DeliveryData implements Subject{
    List<Observer>observers;
    private String location;

    DeliveryData(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update(location);
        }
    }

    public  void locationChanged(){
        this.location = getLocation();
        notifyObservers();
    }
    public  String getLocation(){
        int min = 0;
        int max = 100;
        return  Integer.toString((int)Math.random() * (max - min + 1) + min);
    }
}
interface Observer{
    void update(String location);
}

class Seller implements Observer{
    private String location;

    @Override
    public void update(String location) {
       this.location = location;
       showLocation();
    }

    public  void showLocation(){
        System.out.println("Notification at Seller - Current Location :: " + location);
    }
}

class User implements  Observer{
    private String location;

    @Override
    public void update(String location) {
          this.location = location;
          showLocation();
    }
    public  void showLocation(){
        System.out.println("Notification at User - Current Location :: " + location);
    }
}

class DeliveryWarehouseCenter implements  Observer{
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }
    public  void showLocation(){
        System.out.println("Notification at User - DeliveryWarehouseCenter Location :: " + location);
    }
}
public class ObserverPattern {
    public static void main(String[] args) {
        DeliveryData topic =  new DeliveryData();
        Observer seller = new Seller();
        Observer user = new User();
        Observer deliveryWHC = new DeliveryWarehouseCenter();

        topic.register(seller);
        topic.register(user);
        topic.register(deliveryWHC);

        topic.locationChanged();
    }
}
