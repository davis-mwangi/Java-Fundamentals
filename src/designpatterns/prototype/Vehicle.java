package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements  Cloneable{
    List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();
    }

    public Vehicle(List<String> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String>tempList = new ArrayList<>();
        tempList.addAll(this.vehicleList);
        return new Vehicle(tempList);
    }
}
