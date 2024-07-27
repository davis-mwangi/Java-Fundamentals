package designpatterns.singleton;

/*
Initialization Type
  - Lazy Initialization
  - Eager Initialization
  - Thread Safe Metos Initialization
  - Thread Safe Block initialization
 */

public class SingletonEager {
    //Initialing and declaring instance
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){

    }
    public  static  SingletonEager  getInstance(){
        return  instance;
    }
}
