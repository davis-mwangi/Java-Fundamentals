package designpatterns.bridge;


abstract class TV{
    Remote remote;
    TV(Remote remote){
        this.remote = remote;
    }
    abstract  void on();
    abstract  void off();
}

class  Sony extends TV {
    Remote remoteType;

    Sony(Remote remote){
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.println("Sony TV ON : ");
        remoteType.on();

    }

    @Override
    void off() {
        System.out.println("Sony TV OFF:: ");
        remoteType.off();
    }
}

class  Phillip extends TV {
    Remote remoteType;

    Phillip(Remote remote){
        super(remote);
        this.remoteType = remote;
    }

    @Override
    void on() {
        System.out.println("Phillip TV ON : ");
        remoteType.on();

    }

    @Override
    void off() {
        System.out.println("Phillip TV OFF:: ");
        remoteType.off();
    }
}


interface Remote{
     public  void on();
     public  void off();
}
class OldRemote implements Remote{

    @Override
    public void on() {
        System.out.println("ON with OLD remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with OLD remote");
    }
}

class NewRemote implements Remote{

    @Override
    public void on() {
        System.out.println("ON with NEW remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with NEW remote");
    }
}

public class Client {

    public static void main(String[] args) {
        TV  sonyOldRemote =  new Sony(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();

        System.out.println();


        TV  sonyNewRemote =  new Sony(new NewRemote());
        sonyNewRemote.on();
        sonyOldRemote.off();

        System.out.println();
    }


}
