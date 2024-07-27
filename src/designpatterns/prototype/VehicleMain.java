package designpatterns.prototype;

public class VehicleMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle vehicle = new Vehicle();
        vehicle.vehicleList.add("Subaru");
        vehicle.vehicleList.add("Mazda");

        System.out.println(vehicle.vehicleList);

       Vehicle vehicle1 = (Vehicle) vehicle.clone();
       vehicle1.vehicleList.add("Toyota");
       System.out.println(vehicle1.vehicleList);

        System.out.println(vehicle.vehicleList);

    }
}
