package designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setRam(2)
//                .setBattery(400)
                .getPhone();

        System.out.println(phone);
    }
}
