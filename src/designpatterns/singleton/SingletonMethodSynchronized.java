package designpatterns.singleton;
//Thread safe
public class SingletonSynchronized {
     private  static  SingletonSynchronized instance;

     private  SingletonSynchronized(){

     }

     public  static synchronized SingletonSynchronized getInstance(){
         //Only one thread can access  here
         if(instance == null){
             instance = new SingletonSynchronized();
         }
         return  instance;
     }
}
