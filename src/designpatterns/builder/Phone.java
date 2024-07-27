package designpatterns.builder;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    //Make this private, can only be created  from Builder
    public Phone(PhoneBuilder phoneBuilder) {
        this.os = phoneBuilder.os;
        this.ram = phoneBuilder.ram;
        this.processor = phoneBuilder.processor;
        this.screenSize = phoneBuilder.screenSize;
        this.battery = phoneBuilder.battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
